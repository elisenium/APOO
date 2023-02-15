public class CompteEnBanque {
    private Personne titulaire;
    private String numeroCompte;
    public double solde;
    public Date dateValidite;
    private Date dateOuverture;

    public CompteEnBanque(Personne nTitulaire, Date nDateValidite, String nNumeroCompte, Date nDateOuverture, double nSolde){
        titulaire = nTitulaire;
        numeroCompte = nNumeroCompte;
        solde = nSolde;
        dateValidite = nDateValidite;
        dateOuverture = nDateOuverture;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public Date getDateValidite() {
        return dateValidite;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public double getSolde() {
        return solde;
    }

    public void setDateValidite(Date nDateValidite){
        dateValidite = nDateValidite;
    }

    public boolean retraitMontant(double montant) {
        solde -= montant;
        return true;
    }

    public boolean depotMontant(double montant) {
        solde += montant;
        return true;
    }

    public boolean virement(double montant, CompteEnBanque autreCompte) {
        solde -= montant;
        autreCompte.solde += montant;
        return true;
    }

    public String toString() {

        return " Le solde du compte bancaire s'eleve a " + solde + " €.";
    }
}