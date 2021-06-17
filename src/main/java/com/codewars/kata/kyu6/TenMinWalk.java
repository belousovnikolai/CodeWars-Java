package com.codewars.kata.kyu6;

/*
 * Take a Ten Minute Walk
 * https://www.codewars.com/kata/54da539698b8a2ad76000228
 */

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0;
        int y = 0;

        for (char direction : walk) {
            switch (Character.toString(direction)) {
                case "n":
                    x++;
                    break;
                case "s":
                    x--;
                    break;
                case "e":
                    y++;
                    break;
                case "w":
                    y--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
