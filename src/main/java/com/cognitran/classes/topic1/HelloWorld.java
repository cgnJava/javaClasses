package com.cognitran.classes.topic1;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int x = 1;
        String a = "a" + x + "b";
        System.out.println(a);

        StringBuilder builder = new StringBuilder();
        builder.append(1).append(2).append(3);
        System.out.println(builder.toString());

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
