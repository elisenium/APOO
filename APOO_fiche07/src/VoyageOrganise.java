import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

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
        if (etape == null) throw new IllegalArgumentException("L'etape est invalide");
        return etapes.add(etape);
    }

    public boolean supprimer(Etape etape){
        if (etape == null) throw new IllegalArgumentException("L'etape est invalide");
        return etapes.remove(etape);
    }

    @Override
    public double calculerPrix() {
        return 0;
    }

    public Iterator<Etape> iterator(){
        return etapes.iterator();
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
