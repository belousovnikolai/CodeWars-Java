package com.codewars.kata.kyu7;

/*
 * Find the next perfect square!
 * https://www.codewars.com/kata/56269eb78ad2e4ced1000013
 */

public class NumberFun {
    public static long findNextSquare(long num) {
        double sq = Math.sqrt(num);
        double sqf = Math.floor(sq);

        if ((sq - sqf) == 0) {
            return (int) Math.pow((sqf + 1), 2);
        }
        return -1;
    }
}
