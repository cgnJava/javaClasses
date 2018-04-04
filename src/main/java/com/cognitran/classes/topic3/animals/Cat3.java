package com.cognitran.classes.topic3.animals;

public class Cat3 {
    private String name;
    private String color;

    public Cat3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void play() {
        System.out.println("Jestem kotkiem " + name + " koloru " + color + "  i się bawię.");
    }
}
