package com.mkzer.strategy;

public class Character {
    private String name;
    private MoveStrategy strategy;

    public Character(String name, MoveStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setMoveStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        System.out.print(name + " : ");
        strategy.move();
    }
}
