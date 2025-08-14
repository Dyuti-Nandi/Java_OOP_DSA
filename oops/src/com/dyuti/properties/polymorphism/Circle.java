package com.dyuti.properties.polymorphism;

public class Circle extends Shapes{

    //This will run when object of circle is created
    //Hence, it is overriding the parent method

    @Override //This is called Annotations
    public void area(){
        System.out.println("Area is pi * r * r");
    }
}
