package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.SplitByValue.splitByValue;
import static org.testng.Assert.assertEquals;

public class SplitByValueTest {
    @Test
    public void testCase1() {
        assertEquals(new int[] {1, 3, 4, 2, 5, 7, 6}, splitByValue(5, new int[] {1, 3, 5, 7, 6, 4, 2}));
        assertEquals(new int[] {5, 2, 7, 3, 2}, splitByValue(0, new int[] {5, 2, 7, 3, 2}));
        assertEquals(new int[] {4, 6, 10, 10, 6}, splitByValue(6, new int[] {6, 4, 10, 10, 6}));
    }
}
