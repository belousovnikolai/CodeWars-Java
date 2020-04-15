package com.codewars.kyu7;

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
