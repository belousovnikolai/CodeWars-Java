package com.codewars.kata.kyu7;

/*
 * Highest And Lowest
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 */

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");

        int max = Arrays.stream(nums).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(nums).mapToInt(Integer::parseInt).min().getAsInt();

        return max + " " + min;
    }
}
