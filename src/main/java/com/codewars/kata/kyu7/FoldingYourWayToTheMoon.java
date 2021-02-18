package com.codewars.kata.kyu7;

/*
 * Folding Your Way To The Moon
 * https://www.codewars.com/kata/58f0ba42e89aa6158400000e
 */

public class FoldingYourWayToTheMoon {
    public static Long fold(Double distance) {
        double pageThickness = 0.0001;
        long fold = 0;

        if (distance < 0) return null;
        while (pageThickness < distance) {
            pageThickness *= 2;
            fold++;
        }
        return fold;
    }
}
