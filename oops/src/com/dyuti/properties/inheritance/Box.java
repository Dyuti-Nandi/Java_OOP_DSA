package com.dyuti.properties.inheritance;

public class Box {
    private double h;
    double l;
    double w;
    double weight;

    public Box(){
//        super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public double getH(){
        return h;
    }

    static void greetings(){
        System.out.println("I am in box class. Hi!");
    }

    public Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Box is running");
    }
}
