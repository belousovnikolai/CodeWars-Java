package com.codewars.kata.kyu7;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu7.MakeAFunctionThatDoesArithmetic.arithmetic;
import static org.testng.Assert.assertEquals;

public class MakeAFunctionThatDoesArithmeticTest {
    @Test
    public void testBasic() {
        assertEquals(3, arithmetic(1, 2, "add"), "'add' should return the two numbers added together!");
        assertEquals(6, arithmetic(8, 2, "subtract"), "'subtract' should return a minus b!");
        assertEquals(10, arithmetic(5, 2, "multiply"), "'multiply' should return a multiplied by b!");
        assertEquals(4, arithmetic(8, 2, "divide"), "'divide' should return a divided by b!");
    }
}
