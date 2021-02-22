package com.codewars.kata.kyu6;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.DecodeTheMorseCode.decode;

public class DecodeTheMorseCodeTest {
    @Test
    public void testExampleFromDescription() {
        Assert.assertEquals(decode(".... . -.--   .--- ..- -.. ."), "hey jude");
    }
}
