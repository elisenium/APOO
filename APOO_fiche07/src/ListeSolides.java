import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides implements Iterable<Solide>{
    private ArrayList<Solide> solides;

    public ListeSolides(){
        solides = new ArrayList<Solide>();
    }

    public boolean estVide(){
        if (solides.isEmpty()) return true;
        else return false;
    }

    public int nombreSolides(){
        return solides.size();
    }

    public boolean ajouter(Solide solide){
        return solides.add(solide);
    }

    public boolean supprimer(Solide solide){
        return solides.remove(solide);
    }

    public boolean contient(Solide solide){
        return solides.contains(solide);
    }

    @Override
    public Iterator<Solide> iterator() {
        return solides.iterator();
    }

    public ArrayList<Solide> trouverPlusGrandVolume(){
        double plusGrandSolide = 0;
        ArrayList<Solide> plusGrandSolides = new ArrayList<Solide>();

        for (Solide solide : solides) {
            if (solide.calculerVolume() >= plusGrandSolide){
                if (solide.calculerVolume() != plusGrandSolide){
                    plusGrandSolides.removeAll(plusGrandSolides);
                }
                plusGrandSolides.add(solide);
                plusGrandSolide = solide.calculerVolume();
            }
        }
        return plusGrandSolides;
    }

    @Override
    public String toString() {
        String toString = "Liste de solides : \n";
        for (Solide solide : solides) {
            toString += solide.toString() + "\n";
        }
        return toString;
    }
}
