package com.codewars.kata.kyu7;

/*
 * Simple Fun: Reverse SimpleFunReverseLetterLetter
 * https://www.codewars.com/kata/58b8c94b7df3f116eb00005b
 */

public class SimpleFunReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
    }
}
