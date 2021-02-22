package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.NoOneLikesCarryingChange.solve;
import static org.testng.Assert.assertEquals;

public class NoOneLikesCarryingChangeTest {
    private int[] coins1 = { 1, 5, 10, 25 };
    private int[] coins2 = { 1, 2, 5, 10, 20, 50 };

    @Test
    public void basicTests() {
        assertEquals(3, solve(75, coins1));
        assertEquals(9, solve(123, coins1));
        assertEquals(3, solve(75, coins2));
        assertEquals(5, solve(123, coins2));
    }
}
