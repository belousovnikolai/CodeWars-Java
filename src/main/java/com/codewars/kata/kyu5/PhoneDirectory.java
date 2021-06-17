package com.codewars.kata.kyu5;

/*
 * Phone Directory
 * https://www.codewars.com/kata/56baeae7022c16dd7400086e
 */

import java.util.stream.Stream;

public class PhoneDirectory {

    public static  String phone(String strng, String num) {
        String[] search = Stream.of(strng.split("\n"))
                .filter(line -> line.contains("+" + num))
                .toArray(String[]::new);

        if (search.length > 1) return "Error => Too many people: " + num;
        else if (search.length == 0) return "Error => Not found: " + num;

        String matchLine = search[0];
        String name = matchLine.split("[<>]")[1];
        String address = matchLine.replace(num, "")
                .replace(name, "")
                .replaceAll("[<>+!$,*?/:;_]", " ")
                .replaceAll("\\s+", " ")
                .trim();

        return String.format("Phone => %s, Name => %s, Address => %s", num, name, address);
    }
}
