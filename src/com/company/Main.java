package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> mergeAllArray = new ArrayList<String>();
    public static void main(String[] args) {
	// write your code here
        Movie movie = new Movie();
        movie.movieCaller();

        com.company.Actor actor = new com.company.Actor();
        actor.ActorCaller();

        Genre genre = new Genre();
        genre.genreCaller();


        String mergeAll = movie.getListMovies() + " " +actor.getListActor() + "" + genre.getListGenre();

        System.out.println(mergeAll);

    }
}
