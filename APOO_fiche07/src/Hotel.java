public class Hotel {
    private String nom;
    private int nombreEtoiles;
    private double prixParNuit;

    public Hotel(String nom, int nombreEtoiles, double prixParNuit) {
        this.nom = nom;
        this.nombreEtoiles = nombreEtoiles;
        this.prixParNuit = prixParNuit;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreEtoiles() {
        return nombreEtoiles;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    @Override
    public String toString() {
        String texte = "Hotel " + getNom() + " - " + getNombreEtoiles() + " étoiles - " + getPrixParNuit() + " €/nuit";
        return texte;
    }
}
