package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class VasyaClerkTest {

    @Test
    public void test() {
        assertEquals("YES", VasyaClerk.Tickets(new int[] {25, 25, 50}));
        assertEquals("NO", VasyaClerk.Tickets(new int []{25, 100}));
        assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 25, 50, 50, 100}));
    }
}
