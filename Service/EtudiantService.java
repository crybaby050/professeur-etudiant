package Service;

import Entity.Etudiant;

public class EtudiantService {
    
    private Etudiant[] etudiants = new Etudiant[100];
    private int nbreEtudiant = 0;

    public void ajouterEtudiant(Etudiant etudiant) {

        etudiants[nbreEtudiant] = etudiant;
        nbreEtudiant++;
    }

    public Etudiant[] getEtudiants() {
        return this.etudiants;
    }

    public int getNbreEtudiant() {
        return nbreEtudiant;
    }
}
