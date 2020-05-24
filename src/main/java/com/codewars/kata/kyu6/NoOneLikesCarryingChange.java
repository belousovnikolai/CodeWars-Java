package com.codewars.kata.kyu6;

import java.util.*;

public class NoOneLikesCarryingChange {
    public static int solve(int amount, int[] coinAmounts) {
        int result = 0;
        int rest = amount;
        Arrays.sort(coinAmounts);

        for (int i = coinAmounts.length - 1; i >= 0; i--) {
            int coin = coinAmounts[i];

            if (rest % coin == 0) {
                result += rest / coin;
                return result;
            } else {
                result += rest / coin;
                rest = rest % coin;
            }
        }
        return result;
    }
}
