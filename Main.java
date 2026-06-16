import java.util.Scanner;

import Service.EtudiantService;
import Service.ProfesseurService;
import View.EtudiantView;
import View.ProfesseurView;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EtudiantService etudiantService = new EtudiantService();
        ProfesseurService professeurService = new ProfesseurService();
        EtudiantView etudiantView = new EtudiantView(etudiantService);
        ProfesseurView professeurView = new ProfesseurView(professeurService);

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
                    etudiantView.ajouterEtudiant();
                    break;
                case 2:
                    etudiantView.listerEtudiant();
                    break;
                case 3:
                    professeurView.ajouterProfesseur();
                    break;
                case 4:
                    professeurView.listerProfesseur();
                    break;
                case 5:
                    System.out.println("AU REVOIR LES GARS !!!");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        }while(choix != 5);
    }
}
