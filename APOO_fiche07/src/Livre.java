public class Livre extends Produit{
    private String titre;
    private String auteur;
    private int nombreDePages;

    public Livre(String reference, double prix, String titre, String auteur, int nombreDePages) {
        super(reference, prix);
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }
}
