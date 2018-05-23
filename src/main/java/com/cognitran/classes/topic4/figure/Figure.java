package com.cognitran.classes.topic4.figure;

/**
 * Stwórz interfejs Figure. Interfejs powinien zawierać metody getCircumference (zwracającą obwód) oraz getArea (zwracającą powierzchnię).
 * Następnie utwórz klasy Circle, Triangle, Rectangle i Square, niech każda z klas implementuje interfejs Figure.
 * konstruktory klas przyjmują takie parametry:
    - Circle - długość promienia, (wykorzystać Math.PI)
    - Triangle - 3 długości boków trójkąta,
    - Rectangle - długość boków prostokąta,
    - Square - dziedziczy po Rectangle - konstruktor przyjmuje tylko jeden parametr

    W teście utwórz instancje tych obiektów i umieśc je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód każdego obiektu.

    Prism - Graniastosłup, który w konstruktorze przyjmuje Figure oraz wysokość i implementuje interfejs ThreeDimensional
    Objętość = Pole podstawy * h
    Pole powierzchni = 2 * pole podstawy + obwód podstawy * h
 */
public interface Figure
{
    double getCircumference();

    double getArea();
}
