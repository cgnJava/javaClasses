package com.cognitran.classes.topic3.animals;

public class CatX {
    final static public String DEFAULT_COLOR = "biały";
    final static public int LEGS = 4;
    private static int count = 0;

    public String name;

    public String color;

    public CatX() {
        this.name = "NO_NAME";
        this.color = DEFAULT_COLOR;
        count += 1;
    }

    public CatX(String name) {
        this.name = name;
        this.color = DEFAULT_COLOR;
        count += 1;
    }

    public CatX(final String name, final String color) {
        this.name = name;
        this.color = color;
        count += 1;
    }

    public static int countAllLegs() {
//        System.out.println(color);
        return count * LEGS;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    protected void say(String what) {
        System.out.println("Jestem kot (" + name + ") o kolorze " + color + " i mówię: -" + what);
    }

    public void play() {
        say("Bawię się włóczką");
    }

    public void playHard() {
        say("gonię za czerwoną kropką");
    }

}
