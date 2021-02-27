package com.codewars.kata.kyu6;

/*
 * Vasya - Clerk
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
 */

import java.util.HashMap;

public class VasyaClerk {

    public static String Tickets(int[] peopleInLine) {
        HashMap<Integer, Integer> cashDesk = new HashMap<>();
        cashDesk.put(25, 0);
        cashDesk.put(50, 0);
        cashDesk.put(100, 0);

        for (int bill : peopleInLine) {
            if (bill == 50) {
                if (cashDesk.get(25) > 0) {
                    cashDesk.put(25, cashDesk.get(25) - 1);
                } return "NO";
            } else if (bill == 100) {
                if (cashDesk.get(50) > 0 && cashDesk.get(25) > 0) {
                    cashDesk.put(25, cashDesk.get(25) - 1);
                    cashDesk.put(50, cashDesk.get(50) - 1);
                } else if (cashDesk.get(25) >= 3) {
                    cashDesk.put(25, cashDesk.get(25) - 3);
                } else return "NO";
            }
            cashDesk.put(bill, cashDesk.get(bill) + 1);
        }
        return "YES";
    }
}
