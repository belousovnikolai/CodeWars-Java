package com.codewars.kata.kyu7;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        String[] letters = str.toLowerCase().split("");
        int x = 0;
        int o = 0;

        for (String letter : letters) {
            if (letter.equals("x")) {
                x++;
            } else if (letter.equals("o")) {
                o++;
            }
        }

        return x == o;
    }
}
