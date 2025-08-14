package com.dyuti.properties.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice(){
        super();
        this.cost = -1;
    }

    public BoxPrice(double h, double l, double w, double weight, double cost){
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
}
