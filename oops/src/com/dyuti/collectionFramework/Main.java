package com.dyuti.collectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(22);
        list.add(30);
        list.add(20);

        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(44);
        list2.add(22);
        list2.add(30);
        list2.add(20);

        System.out.println(list2);

        // Vectors are same as arraylist but unlike arraylist only one thread can access vector at one single time, that's why it's slower than arrayList
        List<Integer> list3 = new Vector<>();
        list3.add(44);
        list3.add(22);
        list3.add(30);
        list3.add(20);

        System.out.println(list3.indexOf(30));
    }
}
