package com.codewars.kata.kyu6;

/*
 * Sums of Parts
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumsOfParts {

    public static int[] sumParts(int[] ls) {
        if (ls.length == 0) return new int[]{ls.length};

        int sum = Arrays.stream(ls).sum();
        List<Integer> res = new ArrayList<>();
        res.add(sum);

        for (int i = 0; i < ls.length; i++) {
            sum -= ls[i];
            res.add(sum);
        }
        return res.stream().mapToInt(a -> a).toArray();
    }
}
