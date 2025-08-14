package com.dyuti.Interfaces;

public interface Engine {
    static final int PRICE = 100000; //Modifier 'final' & 'Static' is redundant for interface fields
    void start(); //we don't have to write abstract because it's redundant for interface methods
    void stop();
    void acc();
}
