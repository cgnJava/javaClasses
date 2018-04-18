package com.cognitran.classes.topic3.animals;

public class Dog8 extends Animal implements CanSwim {

    public Dog8(String name) {
        super(name);
    }

    @Override
    public void play() {
        say("wow wow");
    }

    @Override
    public void swim() {
        say("swimming like dog");
    }
}
