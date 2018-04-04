package com.cognitran.classes.topic3.animals;

public class Cat7 {
    public static final int LEGS_COUNT = 4;
    public static String defaultColor = "biały";
    private static int catsCount = 0;

    private final int id;
    private final String name;
    private String color;

    public Cat7(String name) {
        this.name = name;
        color = defaultColor;
        id = catsCount++;
    }

    public Cat7(String name, String color) {
        this.name = name;
        this.color = color;
        id = catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    private void say(final String what) {
        System.out.println(name + "(kot:" + id + "): " + what);
    }

    public void play() {
        say("bawię się w kolorze " + color);
    }

    public void play(String how) {
        say("bawię się w kolorze " + color + " w " + how);
    }

}
