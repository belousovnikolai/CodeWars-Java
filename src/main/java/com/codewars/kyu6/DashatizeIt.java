package com.codewars.kyu6;

public class DashatizeIt {
    public static String dashatize(int num) {

        String[] numbers = String.valueOf(num).replaceAll("-", "").split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);

            if (number % 2 != 0) {
                if (i != 0 && !result.toString().endsWith("-")) {
                    result.append("-");
                }
                result.append(number);
                if (i != numbers.length-1) {
                    result.append("-");
                }
            } else {
                result.append(number);
            }
        }
        return result.toString();
    }
}
