package com.dyuti.objectCloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{3, 4, 5, 6, 1};
    }

    public Human(Human other) {
        this.name = other.name;
        this.age = other.age;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // This is shallow copy
//        return super.clone();
//    }


// This is deep copy
@Override
public Object clone() throws CloneNotSupportedException {
    // This is shallow copy
    Human twin = (Human) super.clone();

    twin.arr = new int[twin.arr.length];

    System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
    return twin;
}

}
