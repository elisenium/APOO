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
    public double calculerPrix() {
        return super.calculerPrix() + reservation.getPrixParNuit() * getDuree();
    }

    @Override
    public String toString() {
        String texte = "\nHotel : " + getReservation();
        return super.toString() + texte;
    }
}
