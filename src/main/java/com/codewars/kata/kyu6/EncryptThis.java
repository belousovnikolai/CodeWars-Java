package com.codewars.kata.kyu6;

import java.util.ArrayList;
import java.util.List;

public class EncryptThis {
    public static String encryptThis(String text) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            String n = "";
            String tmp = "";

            for (int j = 0; j < word.length(); j++) {
                if (j == 0) {
                    n += (int) word.charAt(j);
                } else if (j == 1) {
                    tmp = String.valueOf(word.charAt(j));
                    n += word.charAt(word.length() - 1);
                } else if (j == word.length() - 1) {
                    n += tmp;
                } else {
                    n += word.charAt(j);
                }
            }
            result.add(n);
        }
        return String.join(" ", result);
    }
}
