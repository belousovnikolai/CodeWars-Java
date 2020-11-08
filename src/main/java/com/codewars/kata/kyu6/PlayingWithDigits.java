package com.codewars.kata.kyu6;

/*
*  https://www.codewars.com/kata/5552101f47fc5178b1000050
*/

public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        String[] digits = String.valueOf(n).split("");
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            int digit = Integer.parseInt(digits[i]);
            sum += Math.pow(digit, p + i);
        }

        return sum % n == 0 ? sum / n : -1;
    }
}
