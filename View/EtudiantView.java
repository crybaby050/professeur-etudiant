package View;

import java.util.Scanner;

import Entity.Etudiant;
import Service.EtudiantService;

public class EtudiantView {
    
    private EtudiantService etudiantService;

    public Scanner sc = new Scanner(System.in);

    public EtudiantView(EtudiantService etudiantService){
        this.etudiantService = etudiantService;
    }

    public void ajouterEtudiant(){
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

        etudiantService.ajouterEtudiant(etudiant);

    }

    public void listerEtudiant(){
        etudiantService.listerEtudiant();
    }
}
