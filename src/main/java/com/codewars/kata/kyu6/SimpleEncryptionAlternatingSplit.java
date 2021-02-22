package com.codewars.kata.kyu6;

/*
 * Simple Encryption #1 - Alternating Split
 * https://www.codewars.com/kata/57814d79a56c88e3e0000786
 */

import java.util.Arrays;

public class SimpleEncryptionAlternatingSplit {

    public static String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty()) return text;
        if (n <= 0) return text;

        StringBuilder everySecond = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                everySecond.append(text.charAt(i));
            } else {
                other.append(text.charAt(i));
            }
        }
        return encrypt(everySecond.append(other).toString(), n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty()) return encryptedText;
        if (n <= 0) return encryptedText;

        String[] digits = encryptedText.split("");
        String[] decrypted = new String[digits.length];

        String[] everySecond = Arrays.copyOfRange(digits, 0, digits.length / 2);
        for (int i = 0; i < everySecond.length; i++) {
            decrypted[(i * 2) + 1] = everySecond[i];
        }

        String[] other = Arrays.copyOfRange(digits, digits.length / 2, digits.length);
        for (int i = 0; i < other.length; i++) {
            decrypted[i * 2] = other[i];
        }

        return decrypt(String.join("", decrypted), n - 1);
    }
}
