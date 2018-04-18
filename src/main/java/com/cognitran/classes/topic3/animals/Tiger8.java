package com.cognitran.classes.topic3.animals;

public class Tiger8 extends Cat8 {

    public Tiger8() {
        super();
    }

    public Tiger8(String name) {
        super(name, "tygrysi");
        int x = 12;
    }

    public Tiger8(String name, String color) {
        super(name);
    }

    protected void say(String what) {
        super.say(what + " !!!wrr!!");
    }

    public void kill() {
        say("zabijam");
    }


    public void playHard() {
        kill();
    }
}
