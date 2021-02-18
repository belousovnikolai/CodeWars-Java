package com.codewars.kata.kyu7;

/*
 * Dictionary
 * https://www.codewars.com/kata/57a93f93bb9944516d0000c1
 */

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        dict = new HashMap<>();
    }

    public void newEntry(String key, String value) {
        dict.put(key, value);
    }

    public String look(String key) {
        return dict.get(key) != null ? dict.get(key) : "Cant find entry for " + key;
    }
}
