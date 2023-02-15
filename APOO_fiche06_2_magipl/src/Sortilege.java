
public class Sortilege extends Carte {
    private String nom;
    private String description;

    public Sortilege(int cout, String nom, String description){
        super(cout);
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String fournirDetail() {
        return "Sortilege" + super.fournirDetail() + "nom : " + getNom() + " " + getDescription();
    }
}
