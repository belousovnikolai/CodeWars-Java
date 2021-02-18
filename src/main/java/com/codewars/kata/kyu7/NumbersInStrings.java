package com.codewars.kata.kyu7;

/*
 * Numbers In Strings
 * https://www.codewars.com/kata/59dd2c38f703c4ae5e000014
 */

import java.util.Arrays;

public class NumbersInStrings {
    public static int solve(String s) {

        String[] tmp = s.replaceAll("[^0-9]", " ").split(" ");
        Integer[] numbers = Arrays.stream(tmp)
                .filter(val -> !val.isEmpty())
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        if (numbers.length > 1) {
            int max = numbers[0];
            for (int n : numbers) {
                if (n > max) {
                    max = n;
                }
            }
            return max;
        }
        return 0;
    }
}
