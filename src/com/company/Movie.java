package com.company;
import java.util.ArrayList;


public class Movie {
    public static ArrayList<String> movies = new ArrayList<>();


    public String getListMovies() {
        System.out.println("\n");
        System.out.println("Movie Titles");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }

        return " ";
    }

    public void addMovie(String movie) {
         movies.add(movie);
    }

    public void  movieCaller(){
        movies.add("007");
        movies.add("Pablo Escobar");
        movies.add("Residence Evil");
        movies.add("Romeo and Juliet");

    }
}