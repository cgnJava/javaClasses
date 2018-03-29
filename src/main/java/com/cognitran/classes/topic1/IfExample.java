package com.cognitran.classes.topic1;

public class IfExample {

    public static void main(String[] args) {
        double x = Math.random() * 5;

        System.out.println("x = " + x);

        if (x > 3) {
            System.out.println("x > 3");
        }
        if (x > 4) {
            System.out.println("x > 4");
        }
        else {
            System.out.println("x nie > 4");
        }
        System.out.println("-----------------------------------------");

        StringBuilder builder = new StringBuilder();
        builder.append(1).append(2).append(3);
        System.out.println(builder.toString());

        // nie używamy znaku == do porównywania stringów - tylko typy prymitywne lub enumeracje
        if ("123" == "123")
        {
            System.out.println("ala ma kota 1");
        }
        if ("123" == builder.toString())
        {
            System.out.println("ala ma kota 2");
        }
    }
}
