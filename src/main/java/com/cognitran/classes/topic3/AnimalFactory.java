package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Animal;
import com.cognitran.classes.topic3.animals.CanFly;
import com.cognitran.classes.topic3.animals.Cat8;
import com.cognitran.classes.topic3.animals.Dog8;
import com.cognitran.classes.topic3.animals.Duck;
import com.cognitran.classes.topic3.animals.Eagle;
import com.cognitran.classes.topic3.animals.MagicTiger;
import com.cognitran.classes.topic3.animals.Plane;
import com.cognitran.classes.topic3.animals.Tiger8;

public class AnimalFactory {

    public Animal[] createAnimals(int howMany)
    {
        Animal[] animals = new Animal[howMany];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = createAnimal();
        }
        return animals;
    }

    private Animal createAnimal() {
        Animal animal;
        int animalType = (int) (Math.random() * 5);

        switch (animalType) {
            case 0:
                animal = new Cat8();
                break;
            case 1:
                animal = new Tiger8("Bonzo");
                break;
            case 2:
                animal = new Dog8("Bingo");
                break;
            case 3:
                animal = new Duck();
                break;
            case 4:
                animal = new MagicTiger("Alladyn");
                break;
            default:
                animal = null;
                break;
        }
        return animal;
    }

    public CanFly[] createFlyingObjects(int howMany)
    {
        CanFly[] animals = new CanFly[howMany];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = createFlyingObject();
        }
        return animals;
    }

    static int id = 0;

    private CanFly createFlyingObject() {
        int animalType = (int) (Math.random() * 4);
        switch (animalType) {
            case 0:
                return new Duck();
            case 1:
                return new Eagle("igel_" + id++);
            case 2:
                return new Duck();
            case 3:
                return new MagicTiger("Alladyn");
            case 4:
                return new Plane();
        }
        return null;
    }


}
