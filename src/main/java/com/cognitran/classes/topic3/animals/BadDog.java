package com.cognitran.classes.topic3.animals;

public class BadDog extends Dog8 {

    private Dog8 friend;

    public BadDog(String name) {
        super(name);
    }

    public BadDog(String name, Dog8 friend) {
        super(name);
        this.friend = friend;
    }

    public void attack(Dog8 enemy) {
        if(enemy == this) {
            return;
        }

        if(enemy == friend) {
            return;
        }

        say("gryzę: " + enemy.getName());

        if (friend!=null && friend instanceof BadDog) {
            ((BadDog)friend).attack(enemy);
        }

        if (enemy instanceof BadDog) {
            enemy.say("Odgryzam się: " + getName());
        }

    }
}
