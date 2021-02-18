package com.codewars.kata.kyu7;

/*
 * Alternate Case
 * https://www.codewars.com/kata/57a62154cf1fa5b25200031e
 */

public class AlternateCase {
    public static String alternateCase(final String string) {
        StringBuilder alternated = new StringBuilder();

        for (String character : string.split("")) {
            if (character.equals(character.toUpperCase())) {
                alternated.append(character.toLowerCase());
            } else if (character.equals(character.toLowerCase())) {
                alternated.append(character.toUpperCase());
            } else {
                alternated.append(character);
            }
        }

        return alternated.toString();
    }
}
