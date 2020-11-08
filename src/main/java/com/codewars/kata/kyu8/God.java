package com.codewars.kata.kyu8;

/*
** https://www.codewars.com/kata/547274e24481cfc469000416
*/

public class God {
    public static Human[] create() {
        return new Human[]{new Man("Adam"), new Woman("Eve")};
    }
}

class Human {
    private final String name;
    private final String gender;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Man extends Human {
    public Man(String name) {
        super(name, "male");
    }
}

class Woman extends Human {
    public Woman(String name) {
        super(name, "female");
    }
}

