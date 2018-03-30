package com.cognitran.classes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample
{
    public static void main(String[] args) {
        List<String> listWithNames = new ArrayList<>();
        listWithNames.add("Leszek");
        listWithNames.add("Michał");

        List<String> drugaLista = new LinkedList<>();
        drugaLista.add("Agata");
        drugaLista.addAll(listWithNames);
        drugaLista.add("Jurek");
        drugaLista.add("Leszek");

        System.out.println(drugaLista.size());
        System.out.println(drugaLista.contains("Leszek"));
        System.out.println(drugaLista.get(1));
        System.out.println(drugaLista.get(4));
        //System.out.println(drugaLista.get(5)); // IndexOutOfBoundsException
    }
}
