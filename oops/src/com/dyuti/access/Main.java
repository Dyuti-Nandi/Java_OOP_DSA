package com.dyuti.access;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "DD");
        SubClass obj1 = new SubClass(10, "KK");
        System.out.println(obj1.num);
    }
}
