import java.time.LocalTime;

public class Vol {
    private LocalTime heure;
    private double prix;
    private String numero, aeroportDepart, aeroportArrivee;

    public Vol(LocalTime heure, double prix, String numero, String aeroportDepart, String aeroportArrivee) {
        this.heure = heure;
        this.prix = prix;
        this.numero = numero;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public double getPrix() {
        return prix;
    }

    public String getNumero() {
        return numero;
    }

    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }

    @Override
    public String toString() {
        return "Vol n°" + numero + " - Départ : " + heure + " " + aeroportDepart + " -> " + aeroportArrivee + " - Prix : " + prix + " €";
    }
}
