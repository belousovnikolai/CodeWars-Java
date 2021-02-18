package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.PredictYourAge.predictAge;
import static org.testng.Assert.assertEquals;

public class PredictYourAgeTest {
    @Test
    public void FixedTests() {
        assertEquals(86, predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, predictAge(32,54,76,65,34,63,64,45));
    }
}
