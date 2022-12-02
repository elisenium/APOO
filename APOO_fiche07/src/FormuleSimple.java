import java.time.LocalDate;
import java.util.Iterator;

public class FormuleSimple extends FormuleDeVacances{
    private Vol volAller, volRetour;

    public FormuleSimple(LocalDate dateDepart, int duree, Vol volAller, Vol volRetour) {
        super(dateDepart, duree);
        this.volAller = volAller;
        this.volRetour = volRetour;
    }

    public Vol getVolAller() {
        return volAller;
    }

    public Vol getVolRetour() {
        return volRetour;
    }

    @Override
    public double calculerPrix() {
        double prix = getVolAller().getPrix() + getVolRetour().getPrix();
        return prix;
    }

    @Override
    public String toString() {
        String texte = "\nVol aller : " + getVolAller() + "\nVol retour : " + getVolRetour()
                + "\nPrix Total : " + calculerPrix() + " €";
        return super.toString() + texte;
    }
}
