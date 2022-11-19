public class Etudiant{

    private String matricule, nom, prenom;

    private Serie serie;

    public Etudiant(String matricule, String nom, String prenom, Serie serie){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.serie = serie;
    }

    public String getNom() {
        return nom;
    }

    public Serie getSerie() {
        return serie;
    }

    public boolean changerSerie(Serie serie){
        if (this.serie == serie || this == this.serie.getDelegue()) {
            return false;
        }
        this.serie = serie;
        return true;
    }

    @Override
    public String toString() {
        return matricule + ", " + nom + " " + prenom + " (série " + serie.getNom() + ")" ;
    }
}