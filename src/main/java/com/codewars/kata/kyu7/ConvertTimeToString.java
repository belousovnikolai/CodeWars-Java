package com.codewars.kata.kyu7;

public class ConvertTimeToString {
    public static String convertTime(int timeDiff) {
        int seconds = timeDiff;

        int days = seconds / 86400;
        seconds %= 86400;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        return String.format("%d %d %d %d", days, hours, minutes, seconds);
    }
}
