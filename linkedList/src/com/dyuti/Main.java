package com.dyuti;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(14);
//        list.insert(10, 3);
//        list.display();
//        System.out.println(list.findIndex(14));
//        System.out.println();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println();
//        System.out.println(list.delete(3));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.display();
//        list.insert(5, 14 );

        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(16);
        list.insertFirst(6);
        list.display();
        System.out.println();
        list.recInsert(13, 3);
//        list.delete(8);

        list.display();
    }
}
