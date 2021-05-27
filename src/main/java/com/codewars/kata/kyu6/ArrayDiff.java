package com.codewars.kata.kyu6;

/*
 * Array.diff
 * https://www.codewars.com/kata/523f5d21c841566fde000009
 */

import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(i -> Arrays.stream(b).noneMatch(j -> i == j))
                .toArray();
    }
}
