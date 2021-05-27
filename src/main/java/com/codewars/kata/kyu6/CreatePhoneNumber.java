package com.codewars.kata.kyu6;

import java.util.Arrays;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return Arrays.toString(numbers)
                .replaceAll("[^0-9]", "")
                .replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }
}
