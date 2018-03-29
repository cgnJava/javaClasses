package com.cognitran.classes.topic1;

public class AndOrExample {

    public static void main(String[] args) {
        String n = "aBr";

        if (n.contains("a") && n.contains("b")) {
            System.out.println("Zawiera a i b");
        }

        if (n.contains("a") || n.contains("A")) {
            System.out.println("Zawiera a lub A");
        }

        if (n.contains("a") || n.contains("A") && n.contains("b") || n.contains("B")) {
            System.out.println("Zawiera a lub A i b lub B");
        }

        if ((n.contains("a") || n.contains("A")) && (n.contains("b") || n.contains("B"))) {
            System.out.println("Zawiera a lub A i b lub B (2 wersja)");
        }

        if ((n.contains("a") || n.contains("A")) && (n.contains("b")
                || n.contains("B")) && !n.contains("r")) {
            System.out.println("Zawiera a lub A i b lub B i nieprawda, że r");
        }
    }
}
