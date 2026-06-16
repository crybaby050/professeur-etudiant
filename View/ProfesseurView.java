package View;

import java.util.Scanner;

import Entity.Professeur;
import Service.ProfesseurService;

public class ProfesseurView {
    
    private ProfesseurService professeurService;
    public Scanner sc = new Scanner(System.in);

    public ProfesseurView(ProfesseurService professeurService){
        this.professeurService = professeurService;
    }

    public void ajouterProfesseur(){ 
        System.out.println("Entrer le nom du professeur");
        String nom = sc.nextLine();
        System.out.println("Entrer le prenom du professeur");
        String prenom = sc.nextLine();
        System.out.println("Entrer l'email du professeur");
        String email = sc.nextLine();
        System.out.println("Entrer le grade du professeur");
        String grade = sc.nextLine();
        System.out.println("Entrer la specialite du professeur");
        String specialite = sc.nextLine();

        Professeur professeur = new Professeur(nom, prenom, email, grade, specialite);

        professeurService.ajouterProfesseur(professeur);

    }

    public void listerProfesseur(){
        professeurService.listerProfesseur();
    }
}
