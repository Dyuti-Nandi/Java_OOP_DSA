package com.dyuti.objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human KK = new Human("KK", 32);
//        Human PP = KK;

        Human Shan = (Human) KK.clone();
        System.out.println(Arrays.toString(Shan.arr));

        Shan.arr[0] = 100;
        System.out.println(Arrays.toString(KK.arr));
    }
}
