package com.codewars.kata.kyu6;

/*
 * Sums of Parts
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b
 */

import java.util.Arrays;

public class SumsOfParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];

        for (int i = 0; i <= ls.length; i++) {
            int[] subArray = Arrays.copyOfRange(ls, i, ls.length + 1);
            int sum = 0;

            for (int val : subArray) {
                sum += val;
            }
            result[i] = sum;
        }
        return result;
    }
}
