package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.SortTheOdd.sortArray;
import static org.testng.Assert.assertEquals;

public class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertEquals(new int[]{ 1, 3, 5, 8, 0 }, sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertEquals(new int[]{}, sortArray(new int[]{}));
    }
}
