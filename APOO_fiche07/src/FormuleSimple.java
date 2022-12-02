import java.time.LocalDate;

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

    public double calculerPrixTotal(){
        double prixTotal = getVolAller().getPrix() + getVolRetour().getPrix();
        return prixTotal;
    }

    @Override
    public String toString() {
        String texte = "\nVol aller : " + getVolAller() + "\nVol retour : " + getVolRetour()
                + "\nPrix Total : " + calculerPrixTotal();
        return super.toString() + texte;
    }
}
