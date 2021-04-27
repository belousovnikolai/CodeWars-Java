package com.codewars.kata.kyu5;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu5.PigLatin.pigIt;
import static org.testng.Assert.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", pigIt("This is my string"));
        assertEquals("hisTay siay ymay tringsay !", pigIt("This is my string !"));
        assertEquals("?", pigIt("?"));
    }
}
