package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Animal;
import com.cognitran.classes.topic3.animals.Cat8;
import com.cognitran.classes.topic3.animals.Tiger8;

public class Animals8_2 {
    
    public static void main(String[] args)
    {
        Animal animal1 = new Tiger8("Tiger2");
        ((Tiger8)animal1).kill();

        System.out.println("**** random ****");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal[] randomAnimals = animalFactory.createAnimals(5);

        for (Animal animal : randomAnimals) {
            animal.play();

            if (animal instanceof Tiger8) {
                Tiger8 ti = (Tiger8) animal;
                ti.kill();
            }
        }
        System.out.println("All cats: " + Cat8.getCount());
    }
}
