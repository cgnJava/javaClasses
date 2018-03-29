package com.cognitran.classes.topic2;

public class Method2Example {

    static int calculate(int a, int b) {
        int c = a + b;
        System.out.println("\nargument a: " + a);
        System.out.println("argument b: " + b);
        System.out.println("obliczono: " + c);
        return c;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int z = calculate(x, y);
        System.out.println("Wynik metody: " + z);

        System.out.println("Wynik metody: " + calculate(12, 35));

        calculate(1, 2);
        calculate(1, calculate(2, 3));

        calculate(calculate(1, 2) + calculate(3, 4), calculate(2, 3));
    }
}
