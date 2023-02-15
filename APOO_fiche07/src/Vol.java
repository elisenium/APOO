import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Vol {
    private LocalDateTime dateHeure;
    private double prix;
    private String numero, aeroportDepart, aeroportArrivee;

    public Vol(LocalDateTime dateHeure, double prix, String numero, String aeroportDepart, String aeroportArrivee) {
        this.dateHeure = dateHeure;
        this.prix = prix;
        this.numero = numero;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }

    public LocalDateTime getdateHeure() {
        return dateHeure;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        return "Vol n°" + numero + " - Départ : " + formatter.format(dateHeure) + " " + aeroportDepart + " -> " + aeroportArrivee + " - Prix : " + prix + " €";
    }
}
