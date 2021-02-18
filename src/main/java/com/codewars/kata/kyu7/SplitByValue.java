package com.codewars.kata.kyu7;

/*
 * Split By Value
 * https://www.codewars.com/kata/5a433c7a8f27f23bb00000dc
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class SplitByValue {

    public static int[] splitByValue(int k, int[] elements) {
        IntStream lower = Arrays.stream(elements).filter(i -> i < k);
        IntStream bigger = Arrays.stream(elements).filter(i -> i >= k);

        return IntStream.concat(lower, bigger).toArray();
    }
}
