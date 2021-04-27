package com.codewars.kata.kyu5;

/*
 * Simple Pig Latin
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
    public static String pigIt(String str) {
        return Stream.of(str.split(" "))
                .map(word -> Pattern.matches("\\p{Punct}", word)
                        ? word
                        : word.substring(1).concat(word.substring(0, 1).concat("ay")))
                .collect(Collectors.joining(" "));
    }
}
