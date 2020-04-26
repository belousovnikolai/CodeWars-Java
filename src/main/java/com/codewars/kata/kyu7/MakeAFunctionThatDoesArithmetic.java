package com.codewars.kata.kyu7;

public class MakeAFunctionThatDoesArithmetic {
    public static int arithmetic(int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
        }
        return result;
    }
}
