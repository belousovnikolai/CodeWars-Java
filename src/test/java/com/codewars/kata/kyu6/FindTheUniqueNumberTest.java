package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.FindTheUniqueNumber.findTheUniqueNumber;
import static org.testng.Assert.assertEquals;

public class FindTheUniqueNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, findTheUniqueNumber(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, findTheUniqueNumber(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
