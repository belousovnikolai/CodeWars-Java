package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.ConvertTimeToString.convertTime;
import static org.testng.Assert.assertEquals;

public class ConvertTimeToStringTest {
    @Test
    public void shouldConvertCorrectly() {
        assertEquals("1 1 1 1", convertTime(90061));
        assertEquals("-1 -1 -1 -1", convertTime(-90061));
    }
}
