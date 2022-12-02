import java.time.LocalDate;

public abstract class FormuleDeVacances {
    private LocalDate dateDepart;
    private int duree;

    public FormuleDeVacances(LocalDate dateDepart, int duree) {
        this.dateDepart = dateDepart;
        this.duree = duree;
        ;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public int getDuree() {
        return duree;
    }

    public abstract double calculerPrix();

    @Override
    public String toString() {
        String texte = "Date de depart : " + dateDepart +
                "\nDuree du voyage : " + getDuree() + " jours";
        return texte;
    }
}
