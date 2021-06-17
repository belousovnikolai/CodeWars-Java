package com.codewars.kata.kyu7;

/*
 * Mumbling
 * https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
 */

public class Mumbling {
    public static String accum(String s) {
        String[] letters = s.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < letters.length; i++) {
            int times = i + 1;
            int counter = 1;
            StringBuilder chunk = new StringBuilder(letters[i].toUpperCase());

            while (counter < times) {
                chunk.append(letters[i].toLowerCase());
                counter++;
            }

            if (i < letters.length - 1) result.append(chunk).append("-");
            else result.append(chunk);
        }
        return result.toString();
    }
}
