package com.dyuti.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car1 = new Car();

//        car1.start();
//        car.acc();
//        car.brake();
//        car.stop();

//        Media mediaCar = new CDPlayer();
//        mediaCar.stop();
        NiceCar carN = new NiceCar();
//        carN.musicStart();
        carN.start();
        carN.upgradeEngine();
        carN.start();
    }
}
