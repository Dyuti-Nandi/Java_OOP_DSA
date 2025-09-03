package com.dyuti.Multithreading;

public class ThreadTest {
    public static void main(String[] args) {
//        new Thread1().start();
        System.out.println("Main is running");
        Thread thread1 = new Thread1("thread1");
//        thread1.setDaemon(true);
        thread1.start();
        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();
        System.out.println("Exit from main");
    }
}
