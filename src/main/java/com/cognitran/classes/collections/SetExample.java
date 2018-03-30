package com.cognitran.classes.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample
{
    public static void main(String[] args)
    {
        Set<String> hash = new HashSet<>();
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        System.out.println(hash);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        System.out.println(treeSet);
    }
}
