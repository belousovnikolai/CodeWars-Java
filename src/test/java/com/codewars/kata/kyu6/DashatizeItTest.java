package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.DashatizeIt.dashatize;
import static org.testng.Assert.assertEquals;

public class DashatizeItTest {
    @Test
    public void testBasic() {
        assertEquals("2-7-4", dashatize(274));
        assertEquals("5-3-1-1", dashatize(5311));
        assertEquals("86-3-20", dashatize(86320));
        assertEquals("9-7-4-3-02", dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", dashatize(0));
        assertEquals("1", dashatize(-1));
        assertEquals("28-3-6-9", dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", dashatize(-1111111111));
    }

}
