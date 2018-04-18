package com.cognitran.classes.topic3.animals;

public class Cat2 {

    public String name;

    public void play() {
        System.out.println("Jestem kotek " + name + " i się bawię.");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Cat2 cat = new Cat2();
        cat.name = "Alik"; // dozwolone, ale nie polecane
        cat.setName("Alik"); //lepsze
    }
}
