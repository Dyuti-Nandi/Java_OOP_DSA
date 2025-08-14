package com.dyuti.properties.polymorphism;

public class Square extends Shapes {

    @Override //This is called annotations
    public void area(){
        System.out.println("Area is side*side");
    }
}
