import java.time.LocalDate;

public class Utilitaire extends Vehicule{
    private static int KM_MAX_PAR_DEFAUT = 50000;
    private int kmEntreDeuxControlesTechniques;
    private double kmAuDernierControleTechnique;

    public Utilitaire(String immatriculation, LocalDate dateMiseEnCirculation, int kmEntreDeuxControlesTechniques){
        super(immatriculation, dateMiseEnCirculation);
        this.kmEntreDeuxControlesTechniques = kmEntreDeuxControlesTechniques;
    }

    public Utilitaire(String immatriculation, LocalDate dateMiseEnCirculation){
        this(immatriculation, dateMiseEnCirculation, KM_MAX_PAR_DEFAUT);
    }

    public int getKmEntreDeuxControlesTechniques() {
        return kmEntreDeuxControlesTechniques;
    }

    public double getKmAuDernierControleTechnique() {
        return kmAuDernierControleTechnique;
    }

    public void setKmAuDernierControleTechnique(double kmAuDernierControleTechnique) {
        this.kmAuDernierControleTechnique = kmAuDernierControleTechnique;
    }

    public boolean estEnOrdre(){
        if (kmAuDernierControleTechnique + kmEntreDeuxControlesTechniques > KM_MAX_PAR_DEFAUT) return true;
        return false;
    }
}
