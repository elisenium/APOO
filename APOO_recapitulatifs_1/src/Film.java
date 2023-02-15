public class Film extends ContenuVideo{
    private int duree;
    private long recettes;

    public Film(String titre, String categorie, int duree, long recettes) {
        super(titre, categorie);
        if (duree <= 0) throw new IllegalArgumentException("la durée est invalide");
        if (recettes < 0) throw new IllegalArgumentException("les recettes sont invalides");
        this.duree = duree;
        this.recettes = recettes;
    }

    public Film(String titre, String categorie, int duree) {
        super(titre, categorie);
        if (duree <= 0) throw new IllegalArgumentException("la durée est invalide");
        this.duree = duree;
        this.recettes = 0;
    }

    @Override
    public String toString() {
        String texte = "Film [id="+ getId() + ", titre=" + getTitre()+ ", catégorie=" + getCategorie() + ", duree=" + duree + ", recettes=" + recettes + "]";

        if (recettes == 0) {
            return "Film [id="+ getId() + ", titre=" + getTitre()+ ", catégorie=" + getCategorie() + ", duree=" + duree + "]";
        }
        return texte;
    }

    public void setDuree(int duree) {
        if (duree <= 0) throw new IllegalArgumentException("la durée est invalide");
        this.duree = duree;
    }

    public void setRecettes(long recettes) {
        if (recettes < 0) throw new IllegalArgumentException("les recettes sont invalides");
        this.recettes = recettes;
    }
}
