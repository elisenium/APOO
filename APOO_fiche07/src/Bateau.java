import java.util.ArrayList;

public class Bateau {
    private String nom;
    private int nombreDeCabines;
    private ArrayList<String> activites;

    public Bateau(String nom, int nombreDeCabines) {
        this.nom = nom;
        this.nombreDeCabines = nombreDeCabines;
        activites = new ArrayList<String>();
    }

    public String getNom() {
        return nom;
    }

    public int getNombreDeCabines() {
        return nombreDeCabines;
    }

    public boolean ajouter(String activite){
        if (activite == null) throw new IllegalArgumentException("L'activite est invalide");
        return activites.add(activite);
    }

    public boolean supprimer(String activite){
        if (activite == null) throw new IllegalArgumentException("L'activite est invalide");
        return activites.add(activite);
    }

    @Override
    public String toString() {
        String texteEtapes = "\n-------------------- ETAPES/ACTIVITES DU VOYAGE --------------------";
        String texte = "Nombre de cabines : " + nombreDeCabines;
        if (activites.isEmpty() == false) {
            for (String a : activites) {
                texteEtapes += "\n" + a;
            }
            return texte + texteEtapes;
        } else{
            return texte;
        }
    }
}
