package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Animal;
import com.cognitran.classes.topic3.animals.Cat8;
import com.cognitran.classes.topic3.animals.Tiger8;

public class Animals8 {
    public static void main(String[] args) {

        Cat8 cat = new Cat8();
        Cat8 tigerAsCat = new Tiger8("Bonzo");
        Tiger8 tiger = new Tiger8();

        Animal catAsAnimal = new Cat8("Bonifacy");

        cat.play();
        tigerAsCat.play();
        tiger.play();
        catAsAnimal.play();

        Animal[] animals = new Animal[] {new Cat8("Cat1"), new Tiger8("Tiger2")};

        for (Animal animal : animals) {
            animal.play();
        }

        System.out.println("All cats: " + Cat8.getCount());
    }
}
