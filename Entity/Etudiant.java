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
        super.afficherInfo();
        System.out.println("Matricule : "+ matricule);
        System.out.println("Filiere : "+ filiere);
    }

    public String getMatricule(){
        return matricule;
    }

    public String getFiliere(){
        return filiere;
    }

    public void setMatricule(String matricule){
        this.matricule = matricule;
    }

    public void setFiliere(String filiere){
        this.filiere = filiere;
    }
}
