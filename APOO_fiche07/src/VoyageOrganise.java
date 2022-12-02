import java.time.LocalDate;
import java.util.ArrayList;

public class VoyageOrganise extends FormuleDeVacances{
    private String nom;
    private double prix;
    private ArrayList<Etape> etapes;

    public VoyageOrganise(LocalDate dateDepart, int duree, String nom, double prix) {
        super(dateDepart, duree);
        this.nom = nom;
        this.prix = prix;
        etapes = new ArrayList<Etape>();
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public boolean ajouter(Etape etape){
        return etapes.add(etape);
    }

    public boolean supprimer(Etape etape){
        return etapes.remove(etape);
    }

    @Override
    public String toString() {
        String texte = "\nNom : " + getNom() + "\nPrix : " + getPrix() + " €";
        if (etapes != null){
            for (Etape e : etapes) {
                texte += "\n" + e.toString();
            }
            return super.toString() + texte;
        }
        return super.toString() + texte;
    }
}
