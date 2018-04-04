package com.cognitran.classes.topic3.animals;

public class Cat4 {

    private String name;
    private String color;

    private void say(String what) {
        System.out.println(name + "(kot): " + what);
    }

    public Cat4(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void play() {
        say("bawię się w kolorze " + color);
    }
}
