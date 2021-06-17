package com.codewars.kata.kyu4;

/*
 * Strip Comments
 * https://www.codewars.com/kata/51c8e37cee245da6b40000bd
 */

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (String ch : commentSymbols) {
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].contains(ch)) {
                    lines[i] = lines[i].substring(0, lines[i].indexOf(ch)).trim();
                } else {
                    lines[i] = lines[i].replaceAll("\\s+$", "");
                }
            }
        }
        return String.join("\n", lines);
    }
}

