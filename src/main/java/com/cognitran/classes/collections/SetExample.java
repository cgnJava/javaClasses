package com.cognitran.classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample
{
    public static void main(String[] args)
    {
        Set<String> hash = new HashSet<>();
        hash.add("1a");
        hash.add("2a");
        hash.add("3a");
        hash.add("4a");
        System.out.println(hash);

        List<String> list1 = new ArrayList<>(hash);
        Collections.sort(list1);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        System.out.println(treeSet);
    }
}
