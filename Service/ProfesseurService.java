package Service;

import Entity.Professeur;

public class ProfesseurService {
    
    private Professeur[] professeurs = new Professeur[100];
    private int nbreProf = 0;

    public void ajouterEtudiant(Professeur professeur){
        professeurs[nbreProf] = professeur;
        nbreProf++;
    }

    public void listerProfesseur(){
        if(nbreProf == 0){
            System.out.println("Aucun professeur enregistrer");
        }else{
            System.out.println("===============LISTE DES PROFESSEURS=============");
            for (int i = 0; i < nbreProf ; i++){
                professeurs[i].afficherInfo();
            }
            System.out.println("===============FIN DE LISTE=============");
        }
    }
}
