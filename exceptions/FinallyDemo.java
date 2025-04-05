package exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("👉 Début du try");

            int result = 10 / 0; // Provoque une exception

            System.out.println("Cette ligne ne s'affichera pas");

        } catch (ArithmeticException e) {
            System.out.println("❗ Exception attrapée : " + e.getMessage());

        } finally {
            System.out.println("✅ Bloc finally exécuté !");
        }

        System.out.println("🎉 Fin du programme");
    }
}
