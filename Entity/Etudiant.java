package Entity;

public class Etudiant extends Personne{
    
    private String matricule;
    private String filiere;

    public Etudiant(String matricule, String filiere){
        this.matricule = matricule;
        this.filiere = filiere;
    }
}
