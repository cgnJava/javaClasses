package com.cognitran.classes.topic3.animals;

public abstract class Animal {

    protected final String name;

    protected void say(String what) {
        System.out.println(name + ": -" + what);
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();
}
