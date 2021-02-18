package com.codewars.kata.kyu7;

/*
 * Are The Numbers In Order
 * https://www.codewars.com/kata/56b7f2f3f18876033f000307
 */

public class AreTheNumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}