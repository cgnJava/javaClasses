package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Cat7;

public class CatsAndStatics2 {
    public static void main(String[] args) {
        Cat7 c1 = new Cat7("Bonifacy", "zielony");
        c1.play();

        new Cat7("Bezdomny");

        Cat7 c2 = new Cat7("Filemon");
        c2.play();

        System.out.println("Mamy: " + Cat7.getCatsCount() + " kotów.");
    }
}
