package com.codewars.kata.kyu7;

/*
 * Credit Card Mask
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 */

public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        }

        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 4) {
                masked.append("#");
            } else {
                masked.append(str.charAt(i));
            }
        }
        return masked.toString();
    }
}
