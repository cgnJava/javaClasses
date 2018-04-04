package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Cat6;

public class CatsAndStatics
{
    public static void main(String[] args) {
        Cat6 c1 = new Cat6("Bonifacy");
        c1.play();

        System.out.println(c1.LEGS_COUNT);
        System.out.println(Cat6.LEGS_COUNT);

        System.out.println(c1.defaultColor);
        System.out.println(Cat6.defaultColor);

        c1.defaultColor = "czarny";

        Cat6 c2 = new Cat6("Bonifacy");
        c2.play();
    }
}
