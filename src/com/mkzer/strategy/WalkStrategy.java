package com.mkzer.strategy;

public class WalkStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Je marche.");
    }
}
