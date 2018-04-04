package com.cognitran.classes.topic3;

import com.cognitran.classes.topic3.animals.Cat2;

public class PackagesImporting
{
    public static void main(String[] args)
    {
        Cat2 cat = new Cat2();
        cat.name = "Filemon";
        cat.play();

        com.cognitran.classes.topic3.caterpilar.Cat2 caterpilar = new com.cognitran.classes.topic3.caterpilar.Cat2();
        caterpilar.dig();
    }
}
