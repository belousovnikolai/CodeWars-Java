package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.PlayingWithDigits.digPow;
import static org.testng.Assert.assertEquals;

public class PlayingWithDigitsTest {

    @Test
    public void Test1() {
        assertEquals(1, digPow(89, 1));
    }

    @Test
    public void Test2() {
        assertEquals(-1, digPow(92, 1));
    }

    @Test
    public void Test3() {
        assertEquals(51, digPow(46288, 3));
    }
}
