package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.SumOfDigitsDigitalRoot.digital_root;
import static org.testng.Assert.assertEquals;

public class SumOfDigitsDigitalRootTest {

    @Test
    public void Test1() {
        assertEquals(7, digital_root(16), "Nope");
    }
    @Test
    public void Test2() {
        assertEquals(6, digital_root(456), "Nope");
    }
}
