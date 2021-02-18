package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.CreditCardMask.maskify;
import static org.testng.Assert.assertEquals;

public class CreditCardMaskTest {
    @Test
    public void testSolution() {
        assertEquals("############5616", maskify("4556364607935616"));
        assertEquals("#######5616", maskify(     "64607935616"));
        assertEquals("1", maskify("1"));
        assertEquals("", maskify(""));
        assertEquals("##ippy", maskify("Skippy")                                  );
        assertEquals("####################################man!", maskify("Nananananananananananananananana Batman!"));
    }
}
