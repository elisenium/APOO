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

    public void elireDelegue(Etudiant etudiant) {
        if (this != etudiant.getSerie()) {
            throw new IllegalArgumentException("Cet etudiant ne fait pas parti de cette serie");
        } if (delegue != null){
            throw new IllegalStateException("Cette serie a deja elu un delegue");
        } delegue = etudiant;
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