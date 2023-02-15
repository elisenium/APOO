
import java.util.ArrayList;

public class Main {
    private ArrayList<Carte> cartes;
    private ArrayList<Carte> cartesPiochees;
    private static final int CARTES_MAXIMUM = 10;

    public Main(){
        cartes = new ArrayList<Carte>();
        cartesPiochees = new ArrayList<Carte>();
    }

    public boolean piocher(Carte carte){
//        if (cartesPiochees.contains(carte) == true){
//            throw new IllegalArgumentException("Carte déjà piochée");
//      }
        if (cartes.size() == CARTES_MAXIMUM) {
            throw new TropDeCartesException();
        }
        cartes.add(carte);
        cartesPiochees.add(carte);
        return false;
    }

    public String jouer(int index){
        Carte carteJouee = cartes.get(index);
        if (index < 0 || index > 9){
            throw new IllegalArgumentException("La carte est invalide");
        }
        cartes.remove(index);
        cartesPiochees.remove(cartes);
        return "Carte jouée : " + carteJouee.fournirDetail() + "\n";
    }

    @Override
    public String toString() {
        String toString = "Carte(s) : \n";
        for (Carte carte : cartes){
            toString += carte.fournirDetail() + "\n";
        }
        return toString;
    }
}