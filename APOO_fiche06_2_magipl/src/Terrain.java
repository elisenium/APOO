
public class Terrain extends Carte {

    private char couleur;
    private static char[] COULEUR = {'B', 'b', 'n', 'r', 'v'};
    private static char COULEUR_PAR_DEFAUT = 'i';
    private static final int COUT_PAR_DEFAUT = 0;

    public Terrain(char couleur){
        super(COUT_PAR_DEFAUT);
        for (char c : COULEUR){
            if (c == couleur){
                this.couleur = c;
                break;
            } else {
            this.couleur = COULEUR_PAR_DEFAUT;
            }
        }
    }

    @Override
    public String fournirDetail() {
        return "Terrain" + super.fournirDetail() + "couleur : " + getCouleur();
    }

    public char getCouleur() {
        return couleur;
    }
}
