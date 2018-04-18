package com.cognitran.classes.topic3.animals;

public class TigerX extends CatX {

    public TigerX() {
        super();
    }

    public TigerX(String name) {
        super(name, "tygrysi");
        int x = 12;
    }

    public TigerX(String name, String color) {
        super(name);
    }

    protected void say(String what) {
        super.say(what);
        System.out.println("!!!!!");
    }

    public void kill() {
        say("zabijam");
    }

    public void playHard() {
        kill();
    }
}
