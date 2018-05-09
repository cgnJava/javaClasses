package com.cognitran.classes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsProblems {

    public static void main(String[] args) {

        String[] array = {"A", "B", "C"};

        List<String> list = Arrays.asList(array);

        List<String> copy = new ArrayList<String>(list);

        array[0] = "a !";
        list.set(1, "b !");
        copy.set(2, "c !");

        System.out.println("array");
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println(s);
        }

        System.out.println("list");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("copy");
        for (String s : copy) {
            System.out.println(s);
        }
//
//        copy.add("D");
//
//        for (String s : copy) {
//            System.out.println(s);
//        }
    }
}
