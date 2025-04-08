public class CouplageTest {
    public static void main(String[] args) {
        Switch s1 = new Switch(new Lamp());
        Switch s2 = new Switch(new Tv());

        s1.activate();
        s2.activate();
    }
}
