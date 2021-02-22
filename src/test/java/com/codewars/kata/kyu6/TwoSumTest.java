package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.TwoSum.twoSum;
import static org.testng.Assert.*;

public class TwoSumTest {

    @Test
    public void basicTests() {
        doTest(new int[]{1, 2, 3}, new int[]{0, 2});
        doTest(new int[]{1234, 5678, 9012}, new int[]{1, 2});
        doTest(new int[]{2, 2, 3}, new int[]{0, 1});
    }

    private void doTest(int[] numbers, int[] expected) {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = twoSum(numbers, target);

        if (null == actual) {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if (actual.length != 2) {
            System.out.format("Received an array that's not of length 2\n");
            fail();
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}
