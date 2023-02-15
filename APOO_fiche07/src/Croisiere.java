import java.time.LocalDate;

public class Croisiere extends VoyageOrganise{
    private Bateau bateau;

    public Croisiere(LocalDate dateDepart, int duree, String nom, double prix, Bateau bateau) {
        super(dateDepart, duree, nom, prix);
        this.bateau = bateau;
    }

    public Bateau getBateau() {
        return bateau;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + bateau;
    }
}
