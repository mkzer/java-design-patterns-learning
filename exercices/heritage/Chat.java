public class Chat extends Animal {

    Chat(String nom) {
        super(nom);
    }

    public void parle() {
        System.out.println("Miaou ! je m'appelle " + nom);
    }
}
