package com.dyuti.Abstraction;

public abstract class Parent {
    int age;
    final int Value;

    public Parent(int age){
        this.age = age;
        Value = 27000;
    }

    abstract void career();
    abstract void partner();
}
