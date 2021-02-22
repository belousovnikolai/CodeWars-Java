package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.BreakCamelCase.camelCase;
import static org.testng.Assert.assertEquals;

public class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertEquals("camel Casing", camelCase("camelCasing"), "Incorrect");
        assertEquals("camel Casing Test", camelCase("camelCasingTest"), "Incorrect");
        assertEquals("camelcasingtest", camelCase("camelcasingtest"), "Incorrect");
    }
}
