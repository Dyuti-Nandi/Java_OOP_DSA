package com.dyuti;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Hashing {
    public static void main(String[] args) {
//        String name = "Dyuti";
//        int code = name.hashCode();
//        System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 78);
        map.put("Dyuti", 98);
        map.put("Disha", 85);

        System.out.println(map.get("Dyuti"));

        HashSet<Integer> set = new HashSet<>();
        set.add(25);
        set.add(32);
        set.add(21);
        set.add(25);
        set.add(40);
        System.out.println(set);
        System.out.println(set.iterator());

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(25);
        set2.add(32);
        set2.add(21);
        set2.add(25);
        set2.add(40);
        System.out.println(set);
    }
}
