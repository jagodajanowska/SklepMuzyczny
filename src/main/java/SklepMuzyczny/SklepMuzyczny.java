package SklepMuzyczny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SklepMuzyczny {

    public ArrayList<Album> albumy = new ArrayList();
    public void dodajAlbum(Album album) {
        albumy.add(album);
    }
    public void usuńAlbum(Album album) {
        albumy.remove(album);
    }

}


/*3a. Projekt - sklep muzyczny

Sklep składa się z nastepujących klas

1. Album
2. Artysta
3. Cena

Zakładamy, że w sklepie znajduje się n albumów. Każdy album to 1-n artystów. Album posiada cenę w 2 walutach (dowolnych) i gatunek
Napisz definicje klas oraz podstawowe metody do obsługi sklepu - dodawanie i usuwanie albumów. (trzeba użyć konstruktora z parametrami)

*/
