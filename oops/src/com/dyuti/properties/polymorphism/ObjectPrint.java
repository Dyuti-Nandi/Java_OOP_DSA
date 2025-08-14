package com.dyuti.properties.polymorphism;

import javax.xml.transform.Source;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
