package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.WordToInitialNumber.convert;
import static org.testng.Assert.assertEquals;

public class WordToInitialNumberTest {

    @Test
    public void convert_test0(){
        int R = 10234567;
        String s = "CodeWars";

        assertEquals(R, convert(s));
    }

    @Test
    public void convert_test1(){
        int R = 1020;
        String s = "KATA";

        assertEquals(R, convert(s));
    }
}
