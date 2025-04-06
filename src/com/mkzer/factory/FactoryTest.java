package com.mkzer.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.createAnimal("dog");
        Animal a2 = AnimalFactory.createAnimal("cat");

        a1.speak();  // Wouf
        a2.speak();  // Miaou
    }
}
