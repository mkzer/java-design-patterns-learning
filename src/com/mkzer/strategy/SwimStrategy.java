package com.mkzer.strategy;

public class SwimStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Je nage.");
    }
}
