package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.BadDog;
import com.cognitran.classes.topic3.animals.Dog8;

public class Dogs {

    public static void main(String[] args) {
        Dog8 pluto = new Dog8("Pluto");
        BadDog buldog = new BadDog("Buldog", pluto);

        Dog8 kajtek = new Dog8("Kajtek");
        BadDog doberman = new BadDog("Doberman", new BadDog("Doberman2"));

        buldog.attack(pluto);
        buldog.attack(kajtek);
        buldog.attack(doberman);

        doberman.attack(kajtek);

    }

}
