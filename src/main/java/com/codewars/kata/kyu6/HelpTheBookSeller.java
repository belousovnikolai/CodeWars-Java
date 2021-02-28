package com.codewars.kata.kyu6;

/*
 * Help the bookseller
 * https://www.codewars.com/kata/54dc6f5a224c26032800005c
 */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class HelpTheBookSeller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String category = lstOf1stLetter[i];
            for (int j = 0; j < lstOfArt.length; j++) {
                String bookCode = lstOfArt[j];

                if (map.get(category) == null) {
                    map.put(category, 0);
                }
                if (bookCode.indexOf(category) == 0) {
                    int bookAmount = Integer.parseInt(bookCode.split(" ")[1]);
                    map.put(category, map.get(category) + bookAmount);
                }
            }
        }

        int counter = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (counter % 2 == 0) {
                result.append("(" + entry.getKey() + " : " + entry.getValue() + ")" + " - ");
            } else {
                result.append("(" + entry.getKey() + " : " + entry.getValue() + ")");
            }
            counter++;
        }
        return result.toString();
    }

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B", "Q"};
        assertEquals("(A : 200) - (B : 1140)", stockSummary(art, cd));
        System.out.println(stockSummary(art, cd));
    }

    @Test
    public void test2() {
        assertEquals("", stockSummary(new String[0], new String[0]));
    }
}
