package com.codewars.kata.kyu7;

public class SimpleFunReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
    }
}
