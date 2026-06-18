package Service;

import Entity.Professeur;

public class ProfesseurService {
    
    private Professeur[] professeurs = new Professeur[100];
    private int nbreProf = 0;

    public void ajouterProfesseur(Professeur professeur){
        professeurs[nbreProf] = professeur;
        nbreProf++;
    }

    public int getNbreProf() {
        return nbreProf;
    }

    public Professeur[] getProfesseurs() {
        return this.professeurs;
    }
}
