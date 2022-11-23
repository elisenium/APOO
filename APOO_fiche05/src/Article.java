import java.util.Objects;

public class Article {
	public static final int TAUX_TVA_PAR_DEFAUT = 23;
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;
	private static int nbreArticles;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
		if (reference == null || reference.equals("")) {
			throw new IllegalArgumentException("La reference est invalide");
		}
		if (nom == null || nom.equals("")) {
			throw new IllegalArgumentException("Le nom est invalide");
		}
		if (prixHTVA <= 0) {
			throw new IllegalArgumentException("Le prix est invalide");
		}
		if (tauxTVA < 0 || tauxTVA > 100) {
			throw new IllegalArgumentException("Le taux TVA est invalide");
		}
		setTauxTVA(tauxTVA);
		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
		nbreArticles++; //permet de faire +1 à chaque création d'article
	}

	public Article(String reference, String nom, String description,
				   double prixHTVA) {
		this(reference,nom,description,prixHTVA, TAUX_TVA_PAR_DEFAUT);
		nbreArticles++; //permet de faire +1 à chaque création d'article

	}

	public String getReference() {
		return reference;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixHTVA() {
		return prixHTVA;
	}

	public void setPrixHTVA(double prixHTVA) {
		this.prixHTVA = prixHTVA;
	}

	public double getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(double tauxTVA) {
		if (tauxTVA < 0 || tauxTVA > 100){
			throw new IllegalArgumentException("Le taux TVA doit etre compris entre 0 et 100");
		}
		this.tauxTVA = tauxTVA;
	}


	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		if (reduction <= 0 || reduction >= 100){
			throw new IllegalArgumentException("La reduction doit etre comprise entre 0 et 100");
		}
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%)";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Article article = (Article) o;
		return reference.equals(article.reference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference);
	}
}
