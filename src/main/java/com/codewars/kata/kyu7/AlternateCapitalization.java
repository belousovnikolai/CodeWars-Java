package com.codewars.kata.kyu7;

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String[] letters = s.split("");
        String right = "";
        String left = "";

        for (int i = 0; i < letters.length; i++) {
            if (i % 2 == 0) {
                right += letters[i].toLowerCase();
                left += letters[i].toUpperCase();
            } else {
                right += letters[i].toUpperCase();
                left += letters[i].toLowerCase();
            }
        }
        return new String[]{left, right};
    }
}
