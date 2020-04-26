package com.codewars.kata.kyu6;

public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
