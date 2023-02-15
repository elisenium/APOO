import java.util.Arrays;

public class Vin extends BoissonAlcoolisee{
    private String cepage, couleur, region, paysOrigine;
    private static final String[] COULEURS_AUTORISEES = {"rouge", "rose", "blanc"};

    Vin(String nom, int contenance, double prix, double degreAlcool, String cepage, String couleur, String region, String paysOrigine) {
        super(nom, contenance, prix, degreAlcool);

        for (String c : COULEURS_AUTORISEES){
            if (c.equals(couleur)){
                this.couleur = c;
                break;
            }
        }
        if (this.couleur == null)
            throw new IllegalArgumentException("Erreur : couleurs permises " + Arrays.toString(COULEURS_AUTORISEES));

        this.cepage = cepage;
        this.region = region;
        this.paysOrigine = paysOrigine;

        if (nom == null || nom.equals("")) {
            throw new IllegalArgumentException("Le nom est invalide");
        }
        if (contenance == 0) {
            throw new IllegalArgumentException("La contenance est invalide");
        }
        if (degreAlcool == 0) {
            throw new IllegalArgumentException("Le degre d'alcool est invalide");
        }
        if (prix == 0){
            throw new IllegalArgumentException("Le prix est invalide");
        }
        if (cepage == null || cepage.equals("")) {
            throw new IllegalArgumentException("Le cepage est invalide");
        }
        if (region == null || region.equals("")){
            throw new IllegalArgumentException("La region est invalide");
        }
        if (paysOrigine == null || paysOrigine.equals("")){
            throw new IllegalArgumentException("Le pays d'origine est invalide");
        }
    }

    @Override
    public double getDegreAlcool() {
        return super.getDegreAlcool();
    }

    public String getCepage() {
        return cepage;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRegion() {
        return region;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    @Override
    public String toString() {
        return super.toString() + " cepage : " + cepage + ", couleur du vin : " + couleur + ", provenance : " + region + ", " + paysOrigine;
    }
}
