package com.codewars.kata.kyu6;

/*
** https://www.codewars.com/kata/54b724efac3d5402db00065e
*/

import com.codewars.helper.MorseCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DecodeTheMorseCode {

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

}
