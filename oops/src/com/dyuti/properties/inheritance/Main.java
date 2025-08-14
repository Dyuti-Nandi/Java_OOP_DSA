package com.dyuti.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2, 3, 4);
//       BoxWeight box2 = new BoxWeight();
//        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box1.l+" "+box1.h+" "+box1.w);
//       System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight);
//        System.out.println(box3.l+" "+box3.w+" "+box3.weight);
//
//        Box box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box4.w);
//
//        BoxWeight box5 = new BoxWeight(box3);
//        System.out.println(box5.l+" "+box5.w+" "+box5.weight);
//
//        BoxPrice box6 = new BoxPrice(8, 10, 200);
//        System.out.println(box6.l+" "+box6.w+" "+box6.weight+" "+box6.cost);
//        Box.greetings();

//        Box box = new BoxWeight();
//        Box.greetings();// you can inherit but cannot override
        System.out.println(box1.getH());
    }
}
