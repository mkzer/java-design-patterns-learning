public class DangerousDivision {

    private int a;
    private int b;

    public DangerousDivision(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void divide() {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro ");

        } else {
            System.out.println(a + "/" + b + "=" + a / b);

        }
    }
}
