import java.util.Scanner;

import Service.EtudiantService;
import Service.ProfesseurService;
import View.EtudiantView;
import View.ProfesseurView;

import Entity.Etudiant;
import Entity.Professeur;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EtudiantService etudiantService = new EtudiantService();
        ProfesseurService professeurService = new ProfesseurService();
        EtudiantView etudiantView = new EtudiantView();
        ProfesseurView professeurView = new ProfesseurView();

        int choix;

        do{
            System.out.println("==========MENU===========");
            System.out.println("1. Ajouter un etudiant :");
            System.out.println("2. lister les etudiants :");
            System.out.println("3. Ajouter un Professer :");
            System.out.println("4. Lister les professeurs :");
            System.out.println("5. Quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    Etudiant e1 = etudiantView.saisieEtudiant();
                    etudiantService.ajouterEtudiant(e1);
                    break;
                case 2:
                    Etudiant[] etudiants = etudiantService.getEtudiants();
                    int nbreEtudiant = etudiantService.getNbreEtudiant();
                    etudiantView.listerEtudiant(etudiants, nbreEtudiant);
                    break;
                case 3:
                    Professeur p1 = professeurView.saisieProfesseur();
                    professeurService.ajouterProfesseur(p1);
                    break;
                case 4:
                    Professeur[] profs = professeurService.getProfesseurs();
                    int nbreProf = professeurService.getNbreProf();
                    professeurView.listerProfesseur(profs, nbreProf);
                    break;
                case 5:
                    System.out.println("AU REVOIR LES GARS !!!");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        }while(choix != 5);
        sc.close();
    }
}
