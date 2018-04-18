package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.*;

public class AnimalFactory {

    public Animal[] createAnimals()
    {
        return new Animal[] {new Cat8("Cat1"), new Tiger8("Tiger2")};
    }

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

    public CanFly[] createFlyingAnimals(int howMany)
    {
        CanFly[] animals = new CanFly[howMany];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = createFlyingAnimal();
        }

        return animals;
    }


    static int id = 0;

    private CanFly createFlyingAnimal() {
        CanFly animal;
        int animalType = (int) (Math.random() * 3);

        switch (animalType) {
            case 0:
                animal = new Duck();
                break;
            case 1:
                animal = new Eagle("igel_" + id++);
                break;
            case 2:
                animal = new Duck();
                break;
            case 3:
                animal = new MagicTiger("Alladyn");
                break;

            default:
                animal = null;
                break;
        }
        return animal;
    }


}
