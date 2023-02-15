import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Livre> livres;

    public Catalogue(){
        livres = new ArrayList<Livre>();
    }

    public boolean contient(Livre livre){
        return livres.contains(livre);
    }

    public boolean ajouter(Livre livre){
        if (this.contient(livre)) {
            return false;
        }
        return livres.add(livre);
    }

    public boolean supprimer(Livre livre){
        return livres.remove(livre);
    }

    public int nombreDeLivres(){
        return livres.size();
    }

    public boolean estVide(){
        if (livres.isEmpty()) {
            System.out.println("Le catalogue est vide");
            return true;
        }
        else {
            System.out.println("Le catalogue n'est pas vide");
            return false;
        }
    }

    public Livre chercherLivre(String isbn){
        for (Livre l : livres) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public String toString() {
        String texte = "Nombre de livres : " + nombreDeLivres();
        for (Livre l : livres){
            texte += "\n" + l.toString();
        }
        return texte;
    }
}