package com.dyuti.Abstraction;

public class Main {
    public static void main(String[] args) {
        Daughter she = new Daughter(21);
        she.career();
        she.partner();

        Son son = new Son(25);
        son.career();
        son.partner();
        System.out.println(son.age);
        System.out.println(she.age);
    }
}
