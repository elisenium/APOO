public class LigneDeCommande {
    private Article article;
    private int quantite;

    public LigneDeCommande(Article article, int quantite) {
        if (article == null || article.equals("")) {
            throw new IllegalArgumentException("Il n'y a pas d'articles");
        } else if (quantite <= 0) {
            throw new IllegalArgumentException("La quantité d'articles est invalide");
        }
        this.article = article;
        this.quantite = quantite;
    }

    public LigneDeCommande(Article article) {
        this(article, 1);
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double calculerPrixTotal() {
        double prixTVAC = 0;
        double prixTotal;

        prixTVAC += article.calculerPrixTVAComprise();
        prixTotal = prixTVAC * quantite;
        return prixTotal;
    }

    @Override
    public String toString() {
        return "Quantité : " + quantite + "x\n" + article;
    }
}
