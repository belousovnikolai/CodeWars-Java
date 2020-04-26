package com.codewars.kata.kyu6;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += (i + 1) - numbers[i];
        }
        return result + numbers.length + 1;
    }
}
