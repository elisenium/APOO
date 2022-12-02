import java.time.LocalDate;

public class Circuit extends VoyageOrganise{
    private String description;

    public Circuit(LocalDate dateDepart, int duree, String nom, double prix, String description) {
        super(dateDepart, duree, nom, prix);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\n" + getDescription();
    }
}
