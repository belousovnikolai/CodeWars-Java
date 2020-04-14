package com.codewars.kyu6;

import java.util.Map;
import java.util.TreeMap;

public class TwosDifference {
    public static int[][] twosDifference(int[] array) {
        Map<Integer, Integer> map = new TreeMap<>();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] + 2) {
                    map.put(array[i], array[j]);
                }
            }
        }

        int result[][] = new int[map.size()][2];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[counter++] = new int[]{entry.getKey(), entry.getValue()};
        }

        return result;
    }
}


