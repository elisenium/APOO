import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AppelTelephonique {
    private LocalDateTime dateHeure;
    private String numeroAppel;
    private Duration dureeAppel;
    private double tarifMinute;
    private static double TARIF_MINUTE_PAR_DEFAUT = 0.15;

    public AppelTelephonique(LocalDateTime dateHeure, String numeroAppel, Duration dureeAppel, double tarifMinute){
        if (dateHeure == null || dateHeure.equals("")) {
            throw new IllegalArgumentException("La date et l'heure sont invalides");
        } if (numeroAppel == null || numeroAppel.equals("")) {
            throw new IllegalArgumentException("Le numero appele est invalide");
        } if (dureeAppel == null || dureeAppel.equals("")) {
            throw new IllegalArgumentException("La duree d'appel est invalide");
        } if (tarifMinute <= 0){
            throw new IllegalArgumentException("Le tarif par minute est invalide");
        }
        this.dateHeure = dateHeure;
        this.numeroAppel = numeroAppel;
        this.dureeAppel = dureeAppel;
        this.tarifMinute = tarifMinute;
    }

    public AppelTelephonique(LocalDateTime dateHeure, String numeroAppel, Duration dureeAppel){
        this(dateHeure, numeroAppel, dureeAppel, TARIF_MINUTE_PAR_DEFAUT);
        if (dateHeure == null || dateHeure.equals("")) {
            throw new IllegalArgumentException("La date et l'heure sont invalides");
        } if (numeroAppel == null || numeroAppel.equals("")) {
            throw new IllegalArgumentException("Le numero appele est invalide");
        } if (dureeAppel == null || dureeAppel.equals("")) {
            throw new IllegalArgumentException("La duree d'appel est invalide");
        }
    }

    public static double getTarifMinuteParDefaut() {
        return TARIF_MINUTE_PAR_DEFAUT;
    }

    public void setTarifMinuteParDefaut(double tarifMinuteParDefaut) {
        if (tarifMinuteParDefaut < 0){
            throw new IllegalArgumentException("Le tarif a la minute par defaut est invalide");
        }
        this.tarifMinute = tarifMinuteParDefaut;
        TARIF_MINUTE_PAR_DEFAUT = tarifMinuteParDefaut;
    }

    public double getTarifMinute() {
        return tarifMinute;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public String getNumeroAppel() {
        return numeroAppel;
    }

    public Duration getDureeAppel() {
        System.out.println(dureeAppel.toMinutes());
        return dureeAppel;
    }

    public double calculerCoutAppelTelephonique(){
        double calculSecToMin = dureeAppel.toSeconds()%60;

        if (this.tarifMinute == tarifMinute){
            if (calculSecToMin != 0){
                return tarifMinute * (dureeAppel.toMinutes()+1);
            } else {
                return tarifMinute * dureeAppel.toMinutes();
            }
        } else {

            if (calculSecToMin != 0){
                return TARIF_MINUTE_PAR_DEFAUT * (dureeAppel.toMinutes()+1);
            } else {
                return TARIF_MINUTE_PAR_DEFAUT * dureeAppel.toMinutes();
            }
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        if (this.tarifMinute == tarifMinute){
            return "Appele le " + formatter.format(dateHeure) +
                    "\nNumero Appele : " + getNumeroAppel() +
                    "\nDuree : " + dureeAppel.toMinutesPart() + " minutes et " + dureeAppel.toSecondsPart() + " secondes" +
                    "\nTarif a la minute : " + getTarifMinute() + " €/min" +
                    "\nCout de l'appel : " + calculerCoutAppelTelephonique() + " €";
        } else {
            return "Appele le " + formatter.format(dateHeure) +
                    "\nNumero Appele : " + getNumeroAppel() +
                    "\nDuree : " + dureeAppel.toMinutes() + " minutes et " + dureeAppel.toSecondsPart() + " secondes" +
                    "\nTarif a la minute : " + TARIF_MINUTE_PAR_DEFAUT + " €/min" +
                    "\nCout de l'appel : " + calculerCoutAppelTelephonique() + " €";
        }
    }
}
