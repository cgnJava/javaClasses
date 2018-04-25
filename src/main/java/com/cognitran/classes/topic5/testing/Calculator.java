package com.cognitran.classes.topic5.testing;

public class Calculator {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static int multiple(int x, int y) {
        return x * y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int calculate(int x, int y, String operation) {

        if (operation.startsWith("print ")) {
            operation = operation.substring(6);
            int result = calculate(x, y, operation);
            System.out.println(x + " " + operation + " " + y + " = " + result);
            return result;
        }

        if (operation.equals("+") || operation.toLowerCase().equals("plus")) {
            return add(x, y);
        }
        else if (operation.equals("*") || operation.equalsIgnoreCase("minus")) {
            return multiple(x, y);
        }
        else if (operation.equals("-")) {
            return substract(x, y);
        }
        else if (operation.equals("/")) {
            return divide(x, y);
        }
        return 0;  // niedozwolona operacja! jak sobie z tym poradzić?
    }
}
