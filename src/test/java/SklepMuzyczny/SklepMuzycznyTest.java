package SklepMuzyczny;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class SklepMuzycznyTest {
    @Test
    public void CzyIlośćAlbumówSięZwiększyPoDodaniuAlbumu(){
        //given
        List<Artysta> artyści= new ArrayList<>();
        artyści.add(new Artysta("Harry","Styles"));

        List<Album> albumy = new ArrayList<>();
        Album album = new Album(artysta,
                new Cena(50,60), Gatunek.POP, 2022);

        //When
        SklepMuzyczny sklepMuzyczny=new SklepMuzyczny(new ArrayList<>());
        sklepMuzyczny.dodajAlbum(album);
        //then
        assertEquals(1, sklepMuzyczny.getAlbumy().size());

    }


}