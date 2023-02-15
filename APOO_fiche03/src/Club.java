public class Club {

    private String matricule, nom;

    private Adresse adresse;

    private Joueur directeur;

    public Club(String matricule, String nom, Adresse adresse){
        this.matricule = matricule;
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Joueur getDirecteur() {
        return directeur;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public boolean designerDirecteur(Joueur directeur){
        if (this != directeur.getClub() || directeur == null || this.directeur != null){
            return false;
        } else {
            this.directeur = directeur;
            return true;
        }
    }

    public void supprimerDirecteur(){
       directeur = null;
    }

    public String toString() {
        return nom;
    }
}