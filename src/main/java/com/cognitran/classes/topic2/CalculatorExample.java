package com.cognitran.classes.topic2;

public class CalculatorExample {

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static int multiple(int x, int y) {
        return x * y;
    }

    static int substract(int x, int y) {
        return x - y;
    }

    static int divide(int x, int y) {
        return x / y;
    }

    static int calculate(int x, int y, String operation) {

        if (operation.startsWith("print ")) {
            operation = operation.substring(6);
            int result = calculate(x, y, operation);
            System.out.println(x + " " + operation + " " + y + " = " + result);
            return result;
        }

        if (operation.equals("+") || operation.toLowerCase().equals("plus"))
            return add(x, y);
        else if (operation.equals("*") || operation.equalsIgnoreCase("minus"))
            return multiple(x, y);
        else if (operation.equals("-"))
            return substract(x, y);
        else if (operation.equals("/"))
            return divide(x, y);
        else return 0;  // niedozwolona operacja! jak sobie z tym poradzić?
    }


    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(multiple(2, 2));
        System.out.println(substract(10, 2));
        System.out.println(divide(4, 2));
        System.out.println(calculate(4, 2, "+"));
        System.out.println(calculate(4, 2, "plus"));

        calculate(4, 2, "print +");
        calculate(4, 2, "print -");

        System.out.println(add(1, 2, 3));

    }


}
