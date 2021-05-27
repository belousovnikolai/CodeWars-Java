package com.codewars.kata.kyu6;

/*
 * Which are in?
 * https://www.codewars.com/kata/550554fd08b86f84fe000a58
 */

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(i -> Arrays.stream(array2).anyMatch(j -> j.contains(i)))
                .sorted()
                .toArray(String[]::new);
    }
}

