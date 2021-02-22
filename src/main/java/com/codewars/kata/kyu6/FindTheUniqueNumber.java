package com.codewars.kata.kyu6;

/*
 * Find The Unique Number
 * https://www.codewars.com/kata/585d7d5adb20cf33cb000235
 */

import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findTheUniqueNumber(double[] arr) {
        Arrays.sort(arr);
        if (arr[0]==arr[1]) {
            return arr[arr.length-1];
        }
        return arr[0];
    }
}
