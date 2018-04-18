package com.cognitran.classes.topic3.animals;

public class Cat8 extends Animal {
    final static public String DEFAULT_COLOR = "biały";
    final static public int LEGS = 4;
    private static int count = 0;

    public String color;

    public Cat8() {
        super("NO_NAME_" + count++);
        this.color = DEFAULT_COLOR;
    }

    public Cat8(String name) {
        super(name);
        this.color = DEFAULT_COLOR;
        count++;
    }

    public Cat8(final String name, final String color) {
        super(name);
        this.color = color;
        count++;
    }

    public static int countAllLegs() {
        return count * LEGS;
    }

    public static int getCount() {
        return count;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void play() {
        say("Bawię się włóczką");
    }

    public void playHard() {
        say("gonię za czerwoną kropką");
    }

}
