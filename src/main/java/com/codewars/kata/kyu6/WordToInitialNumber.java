package com.codewars.kata.kyu6;

/*
 * Word To Initial Number
 * https://www.codewars.com/kata/5bb148b840196d1be50000b1
 */

import java.util.HashMap;
import java.util.Map;

public class WordToInitialNumber {
    public static long convert(String word){
        if (word.isEmpty()) return 0;

        String[] chars = word.toLowerCase().split("");
        Map<String, Integer> occurrences = getNumbersMap(chars);

        return getNumber(chars, occurrences);
    }

    private static Map<String, Integer> getNumbersMap(String[] chars) {
        Map<String, Integer> occurrences = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < chars.length; i++) {
            String ch = chars[i];
            if (i > 0 && !occurrences.containsKey(ch) && !occurrences.containsValue(0)) {
                occurrences.put(ch, 0);
            } else if (!occurrences.containsKey(ch)) {
                occurrences.put(ch, counter++);
            }
        }

        return occurrences;
    }

    private static long getNumber(String[] chars, Map<String, Integer> occurrences) {
        StringBuilder sb = new StringBuilder();

        for (String ch : chars) {
            sb.append(occurrences.get(ch));
        }

        return Long.parseLong(sb.toString());
    }
}
