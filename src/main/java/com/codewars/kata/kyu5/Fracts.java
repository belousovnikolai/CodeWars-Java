package com.codewars.kata.kyu5;

/*
 * Common Denominators
 * https://www.codewars.com/kata/54d7660d2daf68c619000d95
 */

public class Fracts {
    public static String convertFrac_2(long[][] lst) {
        long lcm = 1;
        long[][] newlst = new long[lst.length][2];
        StringBuilder result = new StringBuilder();

        for  (int i = 0; i < lst.length; i++) {
            long g = gcd(lst[i][0], lst[i][1]);
            newlst[i][0] = lst[i][0] / g;
            newlst[i][1] = lst[i][1] / g;
        }
        for (long[] arr : newlst) {
            lcm = lcm(lcm, arr[1]);
        }

        for (long[] arr : newlst) {
            result.append("(")
                    .append(arr[0] * lcm / arr[1])
                    .append(",")
                    .append(lcm)
                    .append(")");
        }
        return result.toString();
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
