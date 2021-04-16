package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class MergerArray {
    ArrayList<String> genre =  ListCreator.createList("genres");
    ArrayList<String> movie = ListCreator.createList("movie");
    ArrayList<String> actor = ListCreator.createList("actor");

    //StringBuilder strBuilder = new StringBuilder();

    public String MergeArrays(){
        String merge = ("Movie: " + movie.toString() +"  Actor: " + actor.toString() +"  Genre: " +genre.toString());
        System.out.println(merge);
        return merge;
    }
}
