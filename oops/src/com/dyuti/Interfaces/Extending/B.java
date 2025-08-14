package com.dyuti.Interfaces.Extending;

public interface B extends A{
    void fun();
    public void hi();

    @Override
    default void abstractMethod() {
        A.super.abstractMethod();
    }
}
