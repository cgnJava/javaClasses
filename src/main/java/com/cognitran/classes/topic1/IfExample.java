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
        } else {
            System.out.println("x nie > 4");
        }
    }
}
