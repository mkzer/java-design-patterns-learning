package com.mkzer.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Cas 1 : Division par zéro
            int result = 10 / 0;

            // Cas 2 : Accès à un tableau hors limites
            int[] tab = {1, 2, 3};
            int x = tab[5];

            // Cas 3 : Mauvais argument
            testAnimal("dragon");

        } catch (ArithmeticException e) {
            System.out.println("❗ ArithmeticException attrapée : " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❗ ArrayIndexOutOfBoundsException attrapée : " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("❗ IllegalArgumentException attrapée : " + e.getMessage());

        } catch (Exception e) {
            // Dernier filet de sécurité
            System.out.println("❗ Autre exception attrapée : " + e.getMessage());
        }

        System.out.println("Programme terminé normalement.");
    }

    public static void testAnimal(String type) {
        if (!type.equalsIgnoreCase("dog") && !type.equalsIgnoreCase("cat")) {
            throw new IllegalArgumentException("Animal inconnu : " + type);
        }
    }
}
