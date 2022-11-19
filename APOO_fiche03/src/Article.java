public class Article {

    public String reference, nom, description;
    public int prixHTVA, tauxTVA;

    public Article(String reference, String nom, String description, int prixHTVA, int tauxTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = tauxTVA;
    }

    public Article(String reference, String nom, String description, int prixHTVA) {
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = 21;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrixHTVA() {
        return prixHTVA;
    }

    public void setPrixHTVA(int prixHTVA) {
        this.prixHTVA = prixHTVA;
    }

    public int getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(int tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public double calculerPrixTVAComprise(){
        double taux = 100 + tauxTVA;
        double prixTVAC = prixHTVA * taux/100;
        return prixTVAC;
    }

    public double calculerPrixTVAComprise(double pourcentage){
        double pourcent = (100-pourcentage)/100;
        double taux = 100 + tauxTVA;
        double prixTVAC = (prixHTVA * taux * pourcent)/100;
        return prixTVAC;
    }

    @Override
    public String toString() {
        return getNom() + "\nRéférence : " + getReference();
    }
}
