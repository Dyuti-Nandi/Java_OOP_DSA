package com.dyuti.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        super();
        this.weight = -1;
    }
//    @Override
//    static void greetings(){
//        System.out.println("I am in boxWeight class. Hi!");
//    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double h, double l, double w, double weight){
//        super(h, l, w);
//        System.out.println(super.weight);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
