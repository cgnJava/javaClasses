package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Cat4;

public class ObjectsAndFinal {

    public static void main(String[] args) {
        System.out.println("Obiekty");

        final Cat4 c = new Cat4("Bonifacy");
        c.setColor("niebieski");

        c.play();

//        c = new Cat4("Filemon");
        c.setColor("zielony");
        c.play();
    }
}
