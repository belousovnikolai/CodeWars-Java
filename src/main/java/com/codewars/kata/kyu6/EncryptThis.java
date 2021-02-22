package com.codewars.kata.kyu6;

/*
 * Encrypt This
 * https://www.codewars.com/kata/5848565e273af816fb000449
 */

import java.util.ArrayList;
import java.util.List;

public class EncryptThis {
    public static String encryptThis(String text) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            StringBuilder n = new StringBuilder();
            String tmp = "";

            for (int j = 0; j < word.length(); j++) {
                if (j == 0) {
                    n.append((int) word.charAt(j));
                } else if (j == 1) {
                    tmp = String.valueOf(word.charAt(j));
                    n.append(word.charAt(word.length() - 1));
                } else if (j == word.length() - 1) {
                    n.append(tmp);
                } else {
                    n.append(word.charAt(j));
                }
            }
            result.add(n.toString());
        }
        return String.join(" ", result);
    }
}
