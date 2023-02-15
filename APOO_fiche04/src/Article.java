
public class Article {
	private String reference;
	private String nom;
	private String description;
	private double prixHTVA;
	private double tauxTVA;

	public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
		setTauxTVA(tauxTVA);
		setDescription(description);
		setPrixHTVA(prixHTVA);
		this.reference = reference;
		this.nom = nom;
	}
	
	public Article(String reference, String nom, String description,
			double prixHTVA) {
		this(reference,nom,description,prixHTVA,21);
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

		Article article = (Article) obj;
		return this.reference == article.reference &&
				this.nom == article.nom &&
				this.description == article.description &&
				this.prixHTVA == article.prixHTVA &&
				this.tauxTVA == article.tauxTVA;
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
		this.tauxTVA = tauxTVA;
	}


	public double calculerPrixTVAComprise() {
		return prixHTVA * (1+ tauxTVA/100);
	}

	public double calculerPrixTVAComprise(int reduction) {
		return calculerPrixTVAComprise() * (1-reduction/100.0);
	}

	public String toString() {
		return "Référence : " + reference + "\nNom : " + nom + " (prix HTVA : " + prixHTVA + ", taux de TVA : " + tauxTVA +"%, prix TVAC : " + calculerPrixTVAComprise() + ")" ;
	}
}