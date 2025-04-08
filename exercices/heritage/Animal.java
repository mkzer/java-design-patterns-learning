public class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;

    }

    public void parle() {
        System.out.println("Je suis un animal nommé " + nom);
    }
}