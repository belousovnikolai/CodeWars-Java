package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.NumbersInStrings.solve;
import static org.testng.Assert.assertEquals;

public class NumbersInStringsTest {
    @Test
    public void basicTests(){
        assertEquals(9, solve("2ti9iei7qhr5"));
        assertEquals(695, solve("gh12cdy695m1"));
        assertEquals(85, solve("lu1j8qbbb85"));
        assertEquals(185, solve("185lu1j8qbbb85"));
    }
}
