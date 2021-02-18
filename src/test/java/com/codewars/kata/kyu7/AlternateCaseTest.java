package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlternateCaseTest {
    @Test
    public void basicAlternateCaseTests() {
        assertEquals("", AlternateCase.alternateCase(""));
        assertEquals("ABC", AlternateCase.alternateCase("abc"));
        assertEquals("abc", AlternateCase.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", AlternateCase.alternateCase("Hello World!"));
    }
}
