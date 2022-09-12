package SklepMuzyczny;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Album {

    private ArrayList<Artysta> Artyści;
    private Cena cena;
    private Gatunek gatunek;
    private int rokWydania;

    public Album(Artysta artysta, Cena cena, Gatunek pop, int rokWydania) {
    }

//    public String objStrData(){
//        return "Album: " + getArtyści() + " " + getGatunek()+ " " + getRokWydania()+ " " + getCena() ;
//    }
    }



