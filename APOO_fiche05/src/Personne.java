public class Personne {
    private String nom, prenom, numeroRegistreNational;
    private char genre;
    private Adresse domicile;
    private Personne mere, pere;

    public Personne(Personne parent1, Personne parent2, String nom, String prenom, char genre,
                    String numeroRegistreNational, Adresse domicile) {
        this(nom, prenom, genre, numeroRegistreNational,domicile);
        if (parent1 == null || parent2 == null){
            throw new IllegalArgumentException("Les parents sont invalides");
        } if (parent1.genre == 'F' && parent2.genre == 'M') {
            this.mere = parent1;
            this.pere = parent2;
        } if (parent1.genre == 'M' && parent2.genre == 'F') {
            this.pere = parent1;
            this.mere = parent2;
        }
    }

    public Personne(Personne parent, String nom, String prenom, char genre, String numeroRegistreNational, Adresse domicile) {
        this(nom, prenom, genre, numeroRegistreNational,domicile);
        if (parent == null){
            throw new IllegalArgumentException("Le parent est invalide");
        } if (parent.genre == 'F') {
            this.mere = parent;
        } if (parent.genre == 'M') {
            this.pere = parent;
        }
    }

    public Personne(String nom, String prenom, char genre, String numeroRegistreNational, Adresse domicile){

        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.numeroRegistreNational = numeroRegistreNational;
        this.domicile = domicile;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public char getGenre() {
        return genre;
    }

    public Personne getPere() {
        return pere;
    }

    public Personne getMere() {
        return mere;
    }

    public String getNumeroRegistreNational() {
        return numeroRegistreNational;
    }

    public Adresse getDomicile() {
        return domicile;
    }

    public void setDomicile(Adresse domicile) {
        this.domicile = domicile;
    }

    public boolean estDescendant2Degres(Personne personne){
        if (this.mere == personne || this.pere == personne) return true;
        if (this.mere != null){
            if (personne == this.mere.getMere()) return true;
            if (personne == this.mere.getPere()) return true;
        } if (this.pere != null){
            if (personne == this.pere.getMere()) return true;
            if (personne == this.pere.getPere()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String nomMere = "Inconnue";
        String nomPere = "Inconnu";

        if (mere != null) nomMere = mere.getPrenom();
        if (pere != null) nomPere = pere.getPrenom();
        return "Personne : " + prenom + " " + nom + " [" + genre + "] (" + numeroRegistreNational + ")" +
                "\nAdresse : " + domicile +
                "\nParents : " + nomMere + " (mere) & " + nomPere + " (pere)";
    }
}
