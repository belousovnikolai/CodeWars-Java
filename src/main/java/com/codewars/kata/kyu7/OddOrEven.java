package com.codewars.kata.kyu7;

/*
 * Odd or Even?
 * https://www.codewars.com/kata/5949481f86420f59480000e7
 */

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
