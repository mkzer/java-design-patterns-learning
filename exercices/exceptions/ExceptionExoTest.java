public class ExceptionExoTest {
    public static void main(String[] args) {
        DangerousDivision d1 = new DangerousDivision(10, 2);
        DangerousDivision d2 = new DangerousDivision(8, 0);

        try {
            d1.divide();
            d2.divide();
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            System.out.println("Fin de l'opération");
        }
    }
}
