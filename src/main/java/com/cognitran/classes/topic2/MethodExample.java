package com.cognitran.classes.topic2;

public class MethodExample {
    static void calculate(int a, int b) {
        int c = a + b;
        System.out.println("argument a: " + a);
        System.out.println("argument b: " + b);
        System.out.println("obliczono: " + c);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        calculate(x, y);
        calculate(12, 35);
    }
}
