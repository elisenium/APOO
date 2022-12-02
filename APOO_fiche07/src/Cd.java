public class Cd extends Produit{
    private String titre;
    private String artiste;
    private int nombreDeMorceaux;

    public Cd(String reference, double prix, String titre, String artiste, int nombreDeMorceaux) {
        super(reference, prix);
        this.titre = titre;
        this.artiste = artiste;
        this.nombreDeMorceaux = nombreDeMorceaux;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNombreDeMorceaux() {
        return nombreDeMorceaux;
    }
}
