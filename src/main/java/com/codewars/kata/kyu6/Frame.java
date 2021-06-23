package com.codewars.kata.kyu6;

/*
 * Invert Array Middle
 * https://www.codewars.com/kata/5a6c4086373c2e2a07000075
 */

public class Frame {
    public static int[][] invertArrayMiddle(int n) {
        int[][] result = new int[n][n];
        int counter = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, counter++) {
                result[j][i] = counter;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int temp = result[i][j];
                result[i][j] = result[j][i];
                result[j][i] = temp;
            }
        }
        return result;
    }
}