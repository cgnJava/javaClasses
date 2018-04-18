package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.*;

public class Animals8_3 {
    public static void main(String[] args) {

        System.out.println("**** random ****");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal[] randomAnimals = animalFactory.createAnimals(5);

        for (Animal animal : randomAnimals) {
            System.out.println("** " + animal.getClass());
            animal.play();

            if (animal instanceof CanSwim) {
                CanSwim s = (CanSwim) animal;
                s.swim();
            }

            if (animal instanceof CanFly) {
                CanFly x = (CanFly) animal;
                x.fly();
            }



        }



        System.out.println("All cats: " + Cat8.getCount());
    }
}
