public class Eleve {
    private String nom;
    private String prenom;
    private Cours cours;
    private Cours coursComplementaire;

    Eleve(String nom, String prenom, Cours cours, Cours coursComplementaire){
        this.nom = nom;
        this.prenom = prenom;
        this.cours = cours;
        this.coursComplementaire = coursComplementaire;
        this.cours.eleveInscrit();
        this.coursComplementaire.eleveInscrit();
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Cours getCours() {
        this.cours.eleveInscrit();
        return cours;
    }

    public Cours getCoursComplementaire() {
        this.coursComplementaire.eleveInscrit();
        return coursComplementaire;
    }
    public void setCoursComplementaire(Cours coursComplementaire) {
        this.coursComplementaire.eleveDesinscrit();
        this.coursComplementaire = coursComplementaire;
        this.coursComplementaire.eleveInscrit();
    }
    @Override
    public String toString(){
        return this.prenom + " " + this.nom + "\nCours principal : "  + this.cours.getIntitule() + "\nCours complémentaire : " +
                this.coursComplementaire.getIntitule();
    }
}