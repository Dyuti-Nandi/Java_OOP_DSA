package com.dyuti.properties.inheritance;


import com.dyuti.access.A;

public class SubClass1 extends A {

    public SubClass1 (int num, String s) {
        super(num, s);
    }

    public static void main(String[] args) {
        SubClass1 obj = new SubClass1(10, "SS");
//        A obj1 = new SubClass1(12, "DD");
//        int n2 = obj1.num;
        int n = obj.num;
        System.out.println(n);
    }
}

class SubSubClass extends SubClass1{

    public SubSubClass(int num, String s) {
        super(num, s);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(15, "PP");
        int n = obj.num;
        System.out.println(n);
    }
}
