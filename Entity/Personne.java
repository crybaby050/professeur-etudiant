package Entity;

public class Personne {
    
    private String nom;
    private String prenom;
    private String email;

    public Personne(){}

    public Personne(String nom, String prenom, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public void afficherInfo(){
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Email : " + email);
    }

}
