package View;

import java.util.Scanner;

import Entity.Professeur;

public class ProfesseurView {
    
    public Scanner sc = new Scanner(System.in);


    public Professeur saisieProfesseur(){ 
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

        return professeur;

    }

    public void listerProfesseur(Professeur[] prof, int nbreProf){
        if(nbreProf == 0){
            System.out.println("Tableau est vide mon pote !!!");
            return;
        }
        System.out.println("===============LISTE DES ETUDIANTS=============");
            for (int i = 0; i < nbreProf ; i++){
                System.out.println("-----------------------------------------------");
                prof[i].afficherInfo();
                System.out.println("-----------------------------------------------");
            }
            System.out.println("===============FIN DE LISTE=============");
        
    }
}
