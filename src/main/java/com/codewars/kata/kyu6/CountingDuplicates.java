package com.codewars.kata.kyu6;

/*
 * Counting Duplicates
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<String, Integer> letters = new HashMap<>();
        int res = 0;

        for (String letter : text.toLowerCase().split("")) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            if (entry.getValue() > 1) res++;
        }

        return res;
    }
}
