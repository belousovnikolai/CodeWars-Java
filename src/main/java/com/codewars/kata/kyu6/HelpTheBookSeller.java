package com.codewars.kata.kyu6;

/*
 * Help the bookseller
 * https://www.codewars.com/kata/54dc6f5a224c26032800005c
 */

public class HelpTheBookSeller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String category = lstOf1stLetter[i];
            int qty = 0;
            String chunk;

            for (String bookCode : lstOfArt) {
                if (bookCode.indexOf(category) == 0) {
                    qty += Integer.parseInt(bookCode.split(" ")[1]);
                }
            }

            chunk = "(" + category + " : " + qty + ")";
            if (i == lstOf1stLetter.length - 1){
                result.append(chunk);
            } else {
                result.append(chunk).append(" - ");
            }
        }
        return result.toString();
    }
}
