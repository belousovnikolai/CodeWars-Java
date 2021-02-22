package com.codewars.kata.kyu6;

/*
 * Sort The Odd
 * https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 */

import java.util.stream.IntStream;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int[] odds = IntStream.of(array)
                .filter(n -> (n % 2) != 0)
                .sorted()
                .toArray();

        int pointer = 0;
        int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sorted[i] =  odds[pointer++];
            } else {
                sorted[i] = array[i];
            }
        }
        return sorted;
    }
}
