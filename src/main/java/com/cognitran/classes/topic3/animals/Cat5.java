package com.cognitran.classes.topic3.animals;

public class Cat5 {
    public static String defaultColor = "biały";

    private final String name;
    private String color;

    public Cat5(final String name) {
        this.name = name;
        color = defaultColor;
    }

    public Cat5(final String name, final String color) {
        this.name = name;
        this.color = color;
    }

    private void say(final String what) {
        System.out.println(name + "(kot): " + what);
    }

    public String getName() {
        return name;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void play() {
        say("bawię się w kolorze " + color);
    }
}
