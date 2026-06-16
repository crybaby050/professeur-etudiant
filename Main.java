import java.util.Scanner;

import Service.EtudiantService;
import View.EtudiantView;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EtudiantService etudiantService = new EtudiantService();
        EtudiantView etudiantView = new EtudiantView(etudiantService);

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
            
                default:
                    System.out.println("AU REVOIR LES GARS !!!");
                    break;
            }
        }while(choix != 3);
    }
}
