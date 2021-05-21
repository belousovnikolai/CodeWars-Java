package com.codewars.kata.kyu6;

/*
 * Reverse or rotate?
 * https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991
 */

import java.util.ArrayList;
import java.util.Arrays;

class RevRot {
    public static String revRot(String strng, int sz) {
        if (sz <= 0 || sz > strng.length()) return "";

        ArrayList<String> chunks = new ArrayList<>();

        for (int i = 0; i < strng.length() / sz; i++) {
            String chunk = strng.substring(i * sz, (i + 1) * sz);
            int sum = Arrays.stream(chunk.split(""))
                    .mapToInt(Integer::valueOf)
                    .map(d -> d * d * d)
                    .sum();

            if (sum % 2 == 0) {
                chunks.add(reverse(chunk));
            } else {
                chunks.add(rotate(chunk));
            }
        }
        return String.join("", chunks);
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String rotate(String str) {
        return str.substring(1) + str.substring(0, 1);
    }
}