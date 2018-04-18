package com.cognitran.classes.topic3.animals;

public class Eagle extends Bird implements AdvancedFly {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void flyTogether(AdvancedFly another) {
        say( getName() + " flying with " + another.getName());
    }

    @Override
    public void play() {
        fly();
    }

    @Override
    public void fly() {
        say("Eagle can fly");
    }
}
