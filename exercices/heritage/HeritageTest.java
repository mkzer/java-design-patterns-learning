
public class HeritageTest {

    public static void main(String[] args) {
        Animal a = new Animal("Bob");
        Chien c1 = new Chien("Rex");
        Chat c2 = new Chat("Minette");

        a.parle();
        c1.parle();
        c2.parle();

    }
}
