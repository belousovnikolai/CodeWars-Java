package com.codewars.kata.kyu6;

/*
 * Sum Of Digits - Digital Root
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 */

public class SumOfDigitsDigitalRoot {
    public static int digital_root(int n) {
        if (String.valueOf(n).length() < 2) return n;

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return digital_root(sum);
    }
}
