import java.util.Objects;

public abstract class ContenuVideo {

    private int id;
    private String titre, categorie;
    private static int idSuivant = 1;
    private static String[] CATEGORIES_POSSIBLES =
            {"action", "science-fiction", "drame", "comédie", "horreur",
                    "thriller", "documentaire", "animation"};

    public ContenuVideo(String titre, String categorie) {
        if (titre == null) throw new IllegalArgumentException("le titre est invalide");
        if (categorie == null) throw new IllegalArgumentException("la catégorie est invalide");
        this.titre = titre;
        for (String c : CATEGORIES_POSSIBLES){
            if (c.equals(categorie)){
                this.categorie = c;
                break;
            }
        }
        this.id = idSuivant;
        idSuivant++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenuVideo that = (ContenuVideo) o;
        return id == that.id && Objects.equals(titre, that.titre) && Objects.equals(categorie, that.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        if (titre == null) throw new IllegalArgumentException("le titre est invalide");
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie == null) throw new IllegalArgumentException("la catégorie est invalide");
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return null;
    }
}
