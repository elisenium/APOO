import java.time.LocalDate;

public class Sejour extends FormuleSimple{
    private Hotel reservation;

    public Sejour(LocalDate dateDepart, int duree, Vol volAller, Vol volRetour, Hotel reservation) {
        super(dateDepart, duree, volAller, volRetour);
        this.reservation = reservation;
    }

    public Hotel getReservation() {
        return reservation;
    }

    @Override
    public double calculerPrixTotal() {
        double prixHotel = reservation.getPrixParNuit() * getDuree();
        return super.calculerPrixTotal() + prixHotel;
    }

    @Override
    public String toString() {
        String texte = "\nHotel : " + getReservation() + "\nPrix total du séjour : " + calculerPrixTotal() + " €";
        return super.toString() + texte;
    }
}
