package com.dyuti.access;

public class ObjectDemo extends A {
    int num;
    String name;

    public ObjectDemo(int num, String name){
        super(num, name);
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(14, "DD");
        ObjectDemo obj2 = new ObjectDemo(14, "SS");

        System.out.println(obj1 instanceof Object);

        if(obj1==obj2){
            System.out.println("-> obj1 equals obj2");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 equals obj2");
        }
    }
}