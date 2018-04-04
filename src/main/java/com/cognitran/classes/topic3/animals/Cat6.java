package com.cognitran.classes.topic3.animals;

public class Cat6 {
    public static final int LEGS_COUNT = 4;
    public static String defaultColor = "biały";

    private final String name;
    private String color;

    public Cat6(String name) {
        this.name = name;
        color = defaultColor;
    }

    public Cat6(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private void say(final String what) {
        System.out.println(name + "(kot): " + what);
    }

    public void play() {
        say("bawię się w kolorze " + color);
    }

    public static int countCatsLegs(int howManyCats) {
        return LEGS_COUNT * howManyCats;
    }
}
