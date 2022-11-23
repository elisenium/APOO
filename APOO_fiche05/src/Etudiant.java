public class Etudiant {

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

    public void changerSerie(Serie serie){
        if (this == this.serie.getDelegue()) {
            throw new IllegalStateException("L'etudiant est le delegue de la serie. Il ne peut donc pas changer de serie");
        } if (this.serie == serie){
            throw new IllegalArgumentException("L'etudiant fait deja parti de cette serie");
        }
        this.serie = serie;
    }

    @Override
    public String toString() {
        return matricule + ", " + nom + " " + prenom + " (série " + serie.getNom() + ")" ;
    }
}