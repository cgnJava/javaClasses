package com.cognitran.classes.topic3.animals;

public class Duck extends Bird implements CanSwim {

    public void swim() {
        say("Swiming");
    }

    @Override
    public void fly() {
        say("Flying");
    }

    @Override
    public void play() {
        say("Duck can have real fun");
        swim();
        fly();
    }
}
