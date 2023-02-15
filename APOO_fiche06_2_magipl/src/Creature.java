
public class Creature extends Carte{
    private String nom;
    private int pointsDeDegats, pointsDeVie;

    public Creature(int cout, String nom, int pointsDeDegats, int pointsDeVie){
        super(cout);
        this.nom = nom;
        this.pointsDeDegats = pointsDeDegats;
        this.pointsDeVie = pointsDeVie;
    }

    public Creature(int cout){
        super(cout);
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeDegats() {
        return pointsDeDegats;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    @Override
    public String fournirDetail() {
        return "Creature" + super.fournirDetail() + "nom : " + getNom() + " (" + getPointsDeDegats() + "/" + getPointsDeVie() + ")";
    }
}
