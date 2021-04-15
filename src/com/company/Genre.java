package com.company;//package com.company;

import java.util.ArrayList;

public class Genre {
    public static ArrayList<String> genres = new ArrayList<>();

    public String getListGenre() {
        System.out.println("\n");
        System.out.println(" Actor Names ");
        for (int i = 0; i < genres.size(); i++) {
            System.out.println(genres.get(i));
        }
        return " ";
    }

    public String addGenre(String genre) {
        return genre;
    }

    public void genreCaller() {
        genres.add(addGenre("Action"));
        genres.add(addGenre("Documentary"));
        genres.add(addGenre("Horror"));
        genres.add(addGenre("Romantic"));
    }
}
