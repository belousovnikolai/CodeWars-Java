package com.codewars.kata.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SplitByValue {

    public int[] splitByValue(int k, int[] elements) {
        IntStream lower = Arrays.stream(elements).filter(i -> i < k);
        IntStream bigger = Arrays.stream(elements).filter(i -> i >= k);

        return IntStream.concat(lower, bigger).toArray();
    }
}
