package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlternateCapitalizationTest {

    @Test
    public void alternateCapitalizationBasicTests(){
        assertEquals(new String[]{"AbCdEf", "aBcDeF"}, AlternateCapitalization.capitalize("abcdef"));
        assertEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, AlternateCapitalization.capitalize("codewars"));
        assertEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, AlternateCapitalization.capitalize("abracadabra"));
        assertEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, AlternateCapitalization.capitalize("codewarriors"));
    }
}
