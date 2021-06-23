package com.codewars.kata.kyu6;

/*
 * Count the smiley faces!
 * https://www.codewars.com/kata/583203e6eb35d7980400002a
 */

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        return arr.stream().mapToInt(smiley -> smiley.matches("[:;][-|~]?[)D]") ? 1 : 0).sum();
    }
}
