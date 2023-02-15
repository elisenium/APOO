public class Serie {
    private char nom;

    private Etudiant delegue;

    public Serie(char nom){
        this.nom = nom;
    }

    public char getNom() {
        return nom;
    }
    public Etudiant getDelegue() {
        return delegue;
    }

    public boolean elireDelegue(Etudiant etudiant) {
        if (this != etudiant.getSerie() || delegue != null) {
            return false;
        } else {
            delegue = etudiant;
            return true;
        }
    }

    @Override
    public String toString() {
        if (this.delegue == null) {
            return "Série " + nom;
        } else {
            return "Série " + nom + " (delegue : " + delegue.getNom() + ")";
        }
    }
}