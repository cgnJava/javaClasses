package com.cognitran.classes.topic3.animals;

public abstract class Bird extends Animal implements CanFly {

    public Bird() {
        super("");
    }

    public Bird(String name) {
        super(name);
    }

    //    abstract void fly();
}
