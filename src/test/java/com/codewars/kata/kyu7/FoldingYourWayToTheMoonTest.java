package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.FoldingYourWayToTheMoon.fold;
import static org.testng.Assert.assertEquals;

public class FoldingYourWayToTheMoonTest {
    @Test
    public void sampleTests() {
        assertEquals((Long)42L, fold(384000000.0));
        assertEquals((Long)0L, fold(0.00005));
    }
}
