package com.codewars.kata.kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int len = word.length();

        if (len % 2 != 0) {
            return word.substring(len / 2, len / 2 + 1);
        }
        return word.substring(len / 2 - 1, len / 2 + 1);
    }
}