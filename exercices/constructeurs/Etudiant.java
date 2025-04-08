public class Etudiant extends Personne {
    private int niveau ; 
    
    Etudiant(String nom , int niveau)
    {
        super(nom);
        this.niveau = niveau ; 
        System.out.println("Niveau : "+niveau);
    }
    
}
