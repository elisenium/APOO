import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehicule {

    private String immatriculation;
    private LocalDate dateMiseEnCirculation, dateDernierControleTechnique;
    private double kilometrage;

    public Vehicule(String immatriculation, LocalDate dateMiseEnCirculation){
        this.immatriculation = immatriculation;
        this.dateMiseEnCirculation = dateMiseEnCirculation;
    }

    abstract boolean estEnOrdre();

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    public LocalDate getDateDernierControleTechnique() {
        return dateDernierControleTechnique;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setDateDernierControleTechnique(LocalDate dateDernierControleTechnique) {
        this.dateDernierControleTechnique = dateDernierControleTechnique;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } if (obj == null){
            return false;
        } if (this.getClass() != obj.getClass()){
            return false;
        }
        Vehicule vehicule = (Vehicule) obj;
        return this.immatriculation == immatriculation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation, dateMiseEnCirculation, dateDernierControleTechnique, kilometrage);
    }
}
