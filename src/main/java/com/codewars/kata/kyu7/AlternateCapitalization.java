package com.codewars.kata.kyu7;

/*
 * Alternate Capitalization
 * https://www.codewars.com/kata/59cfc000aeb2844d16000075
 */

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String[] letters = s.split("");
        StringBuilder right = new StringBuilder();
        StringBuilder left = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            if (i % 2 == 0) {
                right.append(letters[i].toLowerCase());
                left.append(letters[i].toUpperCase());
            } else {
                right.append(letters[i].toUpperCase());
                left.append(letters[i].toLowerCase());
            }
        }
        return new String[]{left.toString(), right.toString()};
    }
}
