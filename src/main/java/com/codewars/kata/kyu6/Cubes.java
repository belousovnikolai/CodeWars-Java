package com.codewars.kata.kyu6;

/*
 * Hidden "Cubic" numbers
 * https://www.codewars.com/kata/55031bba8cba40ada90011c4
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Cubes {
    public String isSumOfCubes(String s) {
        String numbers = s.replaceAll("[^0-9]", " ").replaceAll("\\s+", " ").trim();
        ArrayList<String> res = new ArrayList<>();

        for (String c : numbers.split(" ")) {
            for (String chunk : c.split("(?<=\\G...)")) {
                int sum = Arrays.stream(chunk.split(""))
                        .mapToInt(Integer::valueOf)
                        .map(i -> i * i * i)
                        .sum();
                if (Integer.parseInt(chunk) == sum) {
                    res.add(chunk);
                }
            }
        }

        return res.size() < 1 ?
                "Unlucky" :
                String.join(" ", res) + " " + res.stream().mapToInt(Integer::valueOf).sum() + " Lucky";
    }
}

