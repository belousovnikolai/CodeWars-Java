package com.codewars.kata.kyu7;

/*
 * Small enough? - Beginner
 * https://www.codewars.com/kata/57cc981a58da9e302a000214
 */

import java.util.Arrays;

public class SmallEnough {
    public static class Kata {
        public static boolean smallEnough(int[] a, int limit) {
            return Arrays.stream(a).allMatch(i -> i <= limit);
        }
    }
}
