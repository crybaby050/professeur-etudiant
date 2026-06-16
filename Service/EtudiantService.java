package Service;

import Entity.Etudiant;

public class EtudiantService {
    
    private Etudiant[] etudiants = new Etudiant[100];
    private int nbreEtudiant = 0;

    public void ajouterEtudiant(Etudiant etudiant) {

        etudiants[nbreEtudiant] = etudiant;
        nbreEtudiant++;
    }

    public void listerEtudiant(){
        if(nbreEtudiant == 0){
            System.out.println("Aucun etudiant enregistrer");
        }else{
            System.out.println("===============LISTE DES ETUDIANTS=============");
            for (int i = 0; i < nbreEtudiant ; i++){
                etudiants[i].afficherInfo();
            }
            System.out.println("===============FIN DE LISTE=============");
        }
    }
}
