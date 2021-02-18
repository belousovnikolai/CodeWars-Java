package com.codewars.kata.kyu7;

/*
 * Array Element Parity
 * https://www.codewars.com/kata/5a092d9e46d843b9db000064
 */

import java.util.Arrays;

public class ArrayElementParity {

    public static int solve(int[] arr) {
        return Arrays.stream(arr).filter(val -> indexOf(arr, val) == -1).toArray()[0];
    }

    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -num) {
                return i;
            }
        }
        return -1;
    }
}
