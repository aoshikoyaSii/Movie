package com.company;

import java.util.ArrayList;

public class Actor {

        private String name;
        private String surname;

        public static ArrayList<String> actor = new ArrayList<>();

        public String getListActor() {
                System.out.println("\n");
                System.out.println(" Actor Names ");
                for (int i = 0; i < actor.size(); i++) {
                        System.out.println(actor.get(i));
                }
                return "";
        }

        public String addName(String name, String surname) {
                String result = name + "  " + surname;
                return result;
        }


        public void ActorCaller() {
                actor.add(addName("Jame", "Bond"));
                actor.add(addName("Guerrez", "Arraujo"));
                actor.add(addName("Christian", "Nobody"));
                actor.add(addName("Leo", "Decaprio"));
        }
}
