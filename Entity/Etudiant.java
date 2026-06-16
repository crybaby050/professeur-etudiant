package Entity;

public class Etudiant extends Personne{
    
    private String matricule;
    private String filiere;

    public Etudiant(String nom, String prenom, String email, String matricule, String filiere){
        super(nom, prenom, email);
        this.matricule = matricule;
        this.filiere = filiere;
    }

    @Override
    public void afficherInfo(){
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        System.out.println("Email : " + getEmail());
        System.out.println("Matricule : "+ matricule);
        System.out.println("Filiere : "+ filiere);
    }
}
