package com.mkzer.strategy;

public class FlyStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Je vole.");
    }
}
