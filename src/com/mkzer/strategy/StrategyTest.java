package com.mkzer.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Character mario = new Character("Mario", new WalkStrategy());
        mario.move(); // Je marche

        mario.setMoveStrategy(new FlyStrategy());
        mario.move(); // Je vole

        mario.setMoveStrategy(new SwimStrategy());
        mario.move(); // Je nage
    }
}
