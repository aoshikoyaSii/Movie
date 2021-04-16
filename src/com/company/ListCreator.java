package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListCreator {
    static ArrayList<String> createList(String fileName) {

        //get file path
        String path = "C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\";

        // reading file
        File file = new File(path + fileName+".txt");

        String listItem;
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                listItem = sc.nextLine();
                list.add(listItem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return list;
    }
}

