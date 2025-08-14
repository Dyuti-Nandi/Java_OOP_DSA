package com.dyuti.Abstraction;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a coder but I always depend on chatgpt why 😭🥹");
    }

    @Override
    void partner() {
        System.out.println("I love Oggy and the Cockroaches 🎀");
    }
}
