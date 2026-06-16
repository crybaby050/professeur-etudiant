package Entity;

public class Professeur extends Personne{

    private String grade;
    private String specialite;

    public Professeur(String nom, String prenom, String email,String grade, String specialite){
        super(nom,prenom,email);
        this.grade = grade;
        this.specialite = specialite;
    }
    
    @Override
    public void afficherInfo(){
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        System.out.println("Email : " + getEmail());
        System.out.println("Matricule : "+ grade);
        System.out.println("Filiere : "+ specialite);
    }

    public String getGrade(){
        return grade;
    }

    public String getSpecialite(){
        return specialite;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setSpecialite(String specialite){
        this.specialite = specialite;
    }
}
