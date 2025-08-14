package com.dyuti.Interfaces.NestedInterfaces;

public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

// this class can't be public
class M implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
       return (num&1)==1;
    }
}

class Main{
    public static void main(String[] args) {
        M obj = new M();
        System.out.println(obj.isOdd(6));
    }
}

