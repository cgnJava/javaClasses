package com.cognitran.classes.topic3;


import com.cognitran.classes.topic3.animals.CatX;

public class CatXExample {

    public static void main(String[] args) {

        System.out.println("nogi " + CatX.countAllLegs());

        final CatX c1 = new CatX("Bonifacy");
        c1.play();

        CatX c2 = new CatX("Kleofas","Niebieski");
        c2.play();

        c2.setColor("bluuuuu");

        System.out.println("---------------");
        c1.play();
        c2.play();
        System.out.println("******");

        System.out.println("nogi " + CatX.countAllLegs());


    }

}
