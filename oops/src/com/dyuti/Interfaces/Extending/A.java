package com.dyuti.Interfaces.Extending;

public interface A {
    void greet();
    default void abstractMethod(){
        System.out.println("this is abstract method");
    }
}
