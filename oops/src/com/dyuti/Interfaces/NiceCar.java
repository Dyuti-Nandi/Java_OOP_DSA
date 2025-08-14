package com.dyuti.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar(){
        engine = new ElectricEngine();
        player = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void musicStart(){
        player.start();
    }
    public void musicStop(){
        player.stop();
    }
    public void upgradeEngine(){
        engine = new PowerEngine();
    }
}
