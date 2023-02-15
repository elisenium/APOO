public class Professeur {
    private String matricule;
    private String nom;
    private String prenom;
    private String specialisation;
    Professeur(String matricule, String nom, String prenom, String specialisation){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.specialisation = specialisation;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getSpecialisation() {
        return specialisation;
    }
    @Override
    public String toString(){
        return this.matricule + " " + this.prenom + " " + this.nom + "\nSpecialisation : " + this.specialisation;
    }
}