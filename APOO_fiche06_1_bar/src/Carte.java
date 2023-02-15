import java.util.ArrayList;

public class Carte {
    private ArrayList<Boisson> boissons;

    public Carte(){
        boissons = new ArrayList<Boisson>();
    }

    public boolean ajouter(Boisson boisson){
        if (contient(boisson) == false) {
            return boissons.add(boisson);
        }
        if (contient(boisson) == true) {
            return false;
        }
        return true;
    }

    public boolean retirer(Boisson boisson){
        return boissons.remove(boisson);
    }

    public boolean contient(Boisson boisson){
        return boissons.contains(boisson);
    }

    public int nombreDeBoissons(){
        return boissons.size();
    }

    @Override
    public String toString() {
        String texte = "Nombre de boissons : " + nombreDeBoissons();
        for (Boisson b : boissons){
            texte += "\n" + b.toString();
        }
        return texte;
    }
}
