public class Cours {
    private String intitule;
    private String niveau;
    private Professeur professeur;
    public int nbrDeleve;
    Cours(String intitule, String niveau, Professeur professeur){
        this.intitule = intitule;
        this.niveau = niveau;
        this.professeur = professeur;

    }

    public void eleveInscrit(){
        nbrDeleve++;
    }
    public void eleveDesinscrit(){
        nbrDeleve--;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getNiveau() {
        return niveau;
    }
    @Override
    public String toString(){
        return this.intitule + "\nCours de niveau " + this.niveau + " donné par " +
                this.professeur.getPrenom() + " " + this.professeur.getNom() + "\nNombre d'élèves inscrits : " + nbrDeleve;
    }
}