import java.time.LocalDate;

public class Voiture extends Vehicule {
    private static int DUREE_AVANT_CONTROLE_TECHNIQUE = 4;
    private static int DUREE_MAX_ENTRE_CONTROLE_TECHNIQUE = 1;

    public Voiture(String immatriculation, LocalDate dateMiseEnCirculation){
        super(immatriculation,dateMiseEnCirculation);
    }

    @Override
    public boolean estEnOrdre() {
        if (LocalDate.now().isBefore(getDateMiseEnCirculation().plusYears(DUREE_AVANT_CONTROLE_TECHNIQUE))) return true;
        if (LocalDate.now().isBefore(getDateDernierControleTechnique().plusYears(DUREE_MAX_ENTRE_CONTROLE_TECHNIQUE))) return true;
        return false;
    }
}
