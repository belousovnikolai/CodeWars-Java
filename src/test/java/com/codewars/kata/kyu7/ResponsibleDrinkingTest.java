package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.ResponsibleDrinking.hydrate;
import static org.testng.Assert.assertEquals;

public class ResponsibleDrinkingTest {
    @Test
    public void drinkingTest() {
        assertEquals("1 glass of water",  hydrate("1 beer"));
        assertEquals("10 glasses of water",  hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }
}
