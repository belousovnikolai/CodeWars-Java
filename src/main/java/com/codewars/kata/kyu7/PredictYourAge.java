package com.codewars.kata.kyu7;

public class PredictYourAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = { age1, age2, age3, age4, age5, age6, age7, age8 };
        int sum = 0;

        for (int age : ages) {
            sum += Math.pow(age, 2);
        }

        return (int) Math.sqrt(sum) / 2;
    }
}
