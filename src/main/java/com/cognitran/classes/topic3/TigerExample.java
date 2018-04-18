package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.CatX;
import com.cognitran.classes.topic3.animals.TigerX;

public class TigerExample {
    public static void main(String[] args) {

        System.out.println("CatX c1 = new CatX()");
        CatX c1 = new CatX("Bonifacy");
        c1.play();
        c1.playHard();


        System.out.println("TigerX t1 = new TigerX()");
        TigerX t1 = new TigerX("Bonzo");
        t1.name = "Bonzo";
        t1.play();
        t1.playHard();
        t1.kill();

        System.out.println("CatX ct1 = new TigerX()");
        CatX ct1 = new TigerX();
        ct1.name = "Bonzo2";
        ct1.play();
        ct1.playHard();
//        ct1.kill();


//        TigerX ct2 = new CatX();



    }
}
