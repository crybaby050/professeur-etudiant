package View;

import java.util.Scanner;

import Entity.Etudiant;

public class EtudiantView {
    
    public Scanner sc = new Scanner(System.in);


    public Etudiant saisieEtudiant(){
        System.out.println("Entrer le nom de l'etudiant");
        String nom = sc.nextLine();
        System.out.println("Entrer le prenom de l'etudiant");
        String prenom = sc.nextLine();
        System.out.println("Entrer l'email de l'etudiant");
        String email = sc.nextLine();
        System.out.println("Entrer le matricule de l'etudiant");
        String matricule = sc.nextLine();
        System.out.println("Entrer la filiere de l'etudiant");
        String filiere = sc.nextLine();

        Etudiant etudiant = new Etudiant(nom, prenom, email, matricule, filiere);

        return etudiant;
    }

    public void listerEtudiant(Etudiant[] etudiants , int nbreEtudiant){
        if(nbreEtudiant == 0){
            System.out.println("Aucun etudiant enregistrer");
        }else{
            System.out.println("===============LISTE DES ETUDIANTS=============");
            for (int i = 0; i < nbreEtudiant ; i++){
                System.out.println("-----------------------------------------------");
                etudiants[i].afficherInfo();
                System.out.println("-----------------------------------------------");
            }
            System.out.println("===============FIN DE LISTE=============");
        }
    }
}
