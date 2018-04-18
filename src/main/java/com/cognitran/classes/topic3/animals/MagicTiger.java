package com.cognitran.classes.topic3.animals;

public class MagicTiger extends Tiger8 implements CanFly {

    public MagicTiger(String name) {
        super(name);
    }

    @Override
    public void fly() {
        say("Tiger can fly");
    }
}
