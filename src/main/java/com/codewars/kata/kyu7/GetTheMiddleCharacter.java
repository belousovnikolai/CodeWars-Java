package com.codewars.kata.kyu7;

/*
 * Get The Middle Character
 * https://www.codewars.com/kata/56747fd5cb988479af000028
 */

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int len = word.length();

        if (len % 2 != 0) {
            return word.substring(len / 2, len / 2 + 1);
        }
        return word.substring(len / 2 - 1, len / 2 + 1);
    }
}