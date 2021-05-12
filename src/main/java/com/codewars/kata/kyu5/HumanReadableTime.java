package com.codewars.kata.kyu5;

/*
 * Human Readable Time
 * https://www.codewars.com/kata/52685f7382004e774f0001f7
 */

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutesLeft = seconds - hours * 3600;
        int minutes = minutesLeft / 60;
        int secondsLeft = minutesLeft - minutes * 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secondsLeft);
    }
}
