public class Chien extends Animal {

    Chien(String nom) {
        super(nom);
    }

    public void parle() {
        System.out.println("Wouf ! je m'appelle " + nom);
    }
}
