package com.codewars.kata.kyu6;

/*
 * Highest Scoring Word
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
 */

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {
    public static String high(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparing(word -> word.chars().map(i -> i - 96).sum())).get();
    }
}