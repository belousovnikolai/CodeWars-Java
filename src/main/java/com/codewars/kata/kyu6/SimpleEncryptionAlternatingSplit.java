package com.codewars.kata.kyu6;

import java.util.Arrays;

public class SimpleEncryptionAlternatingSplit {
    public static String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty()) return text;
        if (n <= 0) return text;

        String[] digits = text.split("");
        String everySecond = "";
        String other = "";

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 != 0) {
                everySecond += digits[i]; // TODO: check string concat in loop
            } else {
                other += digits[i]; // TODO: check string concat in loop
            }
        }
        return encrypt(everySecond.concat(other), n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty()) return encryptedText;
        if (n <= 0) return encryptedText;

        String[] digits = encryptedText.split("");
        String[] decrypted = new String[digits.length];

        String[] everySecond = Arrays.copyOfRange(digits, 0, digits.length / 2);
        for (int i = 0; i < everySecond.length; i++) {
            decrypted[(i * 2) + 1] = everySecond[i]; // TODO: check string concat in loop
        }

        String[] other = Arrays.copyOfRange(digits, digits.length / 2, digits.length);
        for (int i = 0; i < other.length; i++) {
            decrypted[i * 2] = other[i]; // TODO: check string concat in loop
        }

        return decrypt(String.join("", decrypted), n - 1);
    }
}
