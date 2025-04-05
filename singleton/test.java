public class test {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

    Logger.log("Hello");
    Logger.log("World");

    System.out.println(l1 == l2); // true

    }
}