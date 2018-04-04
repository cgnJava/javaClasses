package com.cognitran.classes.topic3.animals;

public class Objects {

    public static void main(String[] args) {
        System.out.println("Obiekty");

        Cat c1 = new Cat();
        c1.name = "Bonifacy";
        c1.play();

        Cat c2 = new Cat();
        c2.name = "Filemon";
        c2.play();

        Cat c3 = c1;
        c3.play();

        System.out.println("##############");
        c1.name = "Boniek";
        c1.play();
        c3.play();
    }
}
