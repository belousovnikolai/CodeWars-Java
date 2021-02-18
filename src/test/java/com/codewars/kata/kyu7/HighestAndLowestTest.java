package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.HighestAndLowest.highAndLow;
import static org.testng.Assert.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void test1() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
