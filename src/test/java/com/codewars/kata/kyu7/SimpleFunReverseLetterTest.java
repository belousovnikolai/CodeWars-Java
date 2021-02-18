package com.codewars.kata.kyu7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFunReverseLetterTest {
    @Test
    public void simpleFunReverseLetter() {
        Assert.assertEquals("nahsirk", SimpleFunReverseLetter.reverseLetter("krishan"));
        Assert.assertEquals("nortlu", SimpleFunReverseLetter.reverseLetter("ultr53o?n"));
    }
}
