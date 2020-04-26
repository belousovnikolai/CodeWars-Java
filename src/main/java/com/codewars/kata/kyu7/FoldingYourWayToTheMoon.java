package com.codewars.kata.kyu7;

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
