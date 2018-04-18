package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.*;

public class Animals8_4 {
    public static void main(String[] args) {
        Eagle e1 = new Eagle("Jan");
        Eagle e2 = new Eagle("Roman");
        e1.flyTogether(e2);
        e2.flyTogether(e1);


        System.out.println("**** random ****");
        AnimalFactory animalFactory = new AnimalFactory();
        CanFly[] randomAnimals = animalFactory.createFlyingAnimals(5);

        AdvancedFly advancedFly = null;

        for (CanFly animal : randomAnimals) {
            System.out.println("** " + animal.getClass());

            if (animal instanceof AdvancedFly) {
                if (advancedFly == null) {
                    advancedFly = (AdvancedFly) animal;
                } else {
                    advancedFly.flyTogether((AdvancedFly) animal);
                    break;
                }

            }

        }

    }
}
