package com.codewars.kata.kyu6;

/*
 * Decode The Morse DecodeTheMorseCodeCode
 * https://www.codewars.com/kata/54b724efac3d5402db00065e
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DecodeTheMorseCode {

    private static HashMap<Integer, String> codes;

    public static String decode(String morseCode) {
        String[] arrayOfCodes = morseCode.split(" {3}");
        String[] result = new String[arrayOfCodes.length];

        for (int i = 0; i < arrayOfCodes.length; i++) {
            result[i] = Arrays.stream(arrayOfCodes[i]
                    .split(" "))
                    .map(MorseCode::get)
                    .collect(Collectors.joining(""));
        }

        return String.join(" ", result);
    }

    // Ignore. Dummy class, added as a stub
    private static class MorseCode {
        private static HashMap<Integer, String> codes;

        public static String get(String code) {
            return codes.get(code);
        }
    }
}
