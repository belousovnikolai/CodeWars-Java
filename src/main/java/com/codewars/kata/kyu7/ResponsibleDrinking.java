package com.codewars.kata.kyu7;

/*
 * Responsible Drinking
 * https://www.codewars.com/kata/5aee86c5783bb432cd000018
 */

public class ResponsibleDrinking {

    public static String hydrate(String drinkString) {

        String[] drinks = drinkString.split(",");
        int amount = 0;

        for (String drink : drinks) {
            amount += Integer.parseInt(drink.replaceAll("[^0-9]", ""));
        }

        if (amount == 1) {
            return amount + " glass of water";
        }

        return amount + " glasses of water";
    }
}
