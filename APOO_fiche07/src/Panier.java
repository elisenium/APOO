import java.util.ArrayList;
public class Panier{
    private ArrayList<Produit> produits;
    public Panier(){
        produits = new ArrayList<Produit>();
    }

    public boolean ajouter(Produit produit){
        return produits.add(produit);
    }

    public boolean supprimer(Produit produit){
        return produits.remove(produit);
    }

    public int nombreProduits(){
        return produits.size();
    }

    public double calculerPrixTotal(){
        double prixTotal = 0;
        for (Produit p: produits) {
            prixTotal += p.getPrix();
        }
        return prixTotal;
    }

    @Override
    public String toString() {
        String texte = "Nombre de produits : " + nombreProduits();
        for (Produit p : produits){
            texte += "\n" + p.getReference() + " (" + p.getPrix() + " €)";
        }
        return texte + "\nPrix total : " + calculerPrixTotal() + " €";
    }

    public boolean contient(Produit produit){
        for (Produit p : produits) {
            if (p.equals(produit)) return true;
        }
        return false;
    }

    public boolean rechercher(String reference){
        for (Produit p : produits) {
            if (p.getReference().equals(reference)) return true;
        }
        return false;
    }
}
