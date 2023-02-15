public class Serie extends ContenuVideo{
    private int nombreEpisodes;

    public Serie(String titre, String categorie, int nombreEpisodes) {
        super(titre, categorie);
        if (nombreEpisodes <= 0) throw new IllegalArgumentException("le nombre d'épisodes est invalide");
        this.nombreEpisodes = nombreEpisodes;
    }

    @Override
    public String toString() {
        String texte = "Série [id="+ getId() + ", titre=" + getTitre()+ ", catégorie=" + getCategorie() + ", nombre d'épisodes=" + nombreEpisodes + "]";
        return texte;
    }

    public void setNombreEpisodes(int nombreEpisodes) {
        if (nombreEpisodes <= 0) throw new IllegalArgumentException("le nombre d'épisodes est invalide");
        this.nombreEpisodes = nombreEpisodes;
    }
}
