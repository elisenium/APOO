import java.util.Objects;

public class Boisson {
    private String nom;
    private int contenance;
    private double prix;

    public Boisson(String nom, int contenance, double prix){
        this.nom = nom;
        this.contenance = contenance;
        this.prix = prix;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } if (obj == null){
            return false;
        } if (this.getClass() != obj.getClass()){
            return false;
        }
        Boisson boisson = (Boisson) obj;
        return boisson.nom == nom && boisson.contenance == contenance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, contenance, prix);
    }

    public String getNom() {
        return nom;
    }

    public int getContenance() {
        return contenance;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return nom + " (" + contenance + " cl), " + prix + " €";
    }
}
