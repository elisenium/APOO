import java.util.Objects;

public class Livre {
	private String isbn;
	private String nom;
	private String prenom;
	private String titre;
	private int nbPages;
	private double prixConseille;
	private int anneeEdition ;

	public Livre(String isbn, String nom, String prenom, String titre,
			int nbPages, double prixConseille, int anneeEdition) {
		this(isbn,nom,titre,nbPages,prixConseille,anneeEdition);
		this.prenom = prenom;
	}
	
	public Livre(String isbn, String nom, String titre,
			int nbPages, double prixConseille, int anneeEdition) {
		this.isbn = isbn;
		this.nom = nom;
		this.titre = titre;
		this.nbPages = nbPages;
		this.setPrixConseille(prixConseille);
		this.anneeEdition = anneeEdition;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitre() {
		return titre;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public int getNbPages() {
		return nbPages;
	}

	public double getPrixConseille() {
		return prixConseille;
	}
	

	public int getAnneeEdition() {
		return anneeEdition;
	}

	public void setPrixConseille(double prixConseille)  {
		this.prixConseille = prixConseille;
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
		Livre livre = (Livre) obj;
		return this.isbn == livre.isbn &&
				this.nom == livre.nom &&
				this.prenom == livre.prenom &&
				this.titre == livre.titre &&
				this.nbPages == livre.nbPages &&
				this.prixConseille == livre.prixConseille &&
				this.anneeEdition == livre.anneeEdition;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn,nom, prenom, titre, nbPages, prixConseille, anneeEdition);
	}

	public String toString(){
		return titre +  " de " + nom + " " + prenom;
	}
	
}
