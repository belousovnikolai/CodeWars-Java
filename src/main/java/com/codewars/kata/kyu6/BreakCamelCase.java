package com.codewars.kata.kyu6;

/*
 * Break camelCase
 * https://www.codewars.com/kata/5208f99aee097e6552000148
 */

public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
