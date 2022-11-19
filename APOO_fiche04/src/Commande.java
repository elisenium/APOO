import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Commande {
	private ArrayList<LigneDeCommande> listeDeCommandes;
	private LocalDate date;
	public Commande(){
		listeDeCommandes = new ArrayList<LigneDeCommande>();
		date = LocalDate.now();
	}

	public ArrayList<LigneDeCommande> listeDeCommandes(){
		for (LigneDeCommande ligne : listeDeCommandes) {
			System.out.println(ligne);
		}
		return this.listeDeCommandes();
	}
	public LocalDate getDate() {
		return date;
	}

	public int quantite(Article article){
		if (article == null){
			throw new IllegalArgumentException("Article invalide");
		}
		for (LigneDeCommande ligne : listeDeCommandes){
			if (ligne.getArticle().equals(article)){
				System.out.println("Il y a " + ligne.getQuantite() + " article(s) (" + ligne.getArticle().getNom() + ")");
				return ligne.getQuantite();
			}
		}
		return 0;
	}

	public void ajouter(Article article, int quantite) {
		if (article == null || quantite <= 0){
			throw new IllegalArgumentException("Article ou quantite invalide");
		}
		for (LigneDeCommande ligne : listeDeCommandes){
			if (ligne.getArticle().equals(article)){
				ligne.setQuantite(ligne.getQuantite() + quantite);
				return;
			}
		}
		listeDeCommandes.add(new LigneDeCommande(article,quantite));
	}

	public void ajouter(Article article) {
		ajouter(article, 1);
	}

	public void supprimer(Article article) {
		if (article == null || article.equals("")){
			throw new IllegalArgumentException("Article invalide");
		}
		listeDeCommandes.removeIf(ligne -> ligne.getArticle().equals(article));
	}

	public void modifier(Article article, int quantite){
		if (quantite < 0){
			throw new IllegalArgumentException("La quantite est invalide");
		}
		if (quantite == 0) {
			supprimer(article);
		}
		for (LigneDeCommande ligne : listeDeCommandes){
			if (ligne.getArticle().equals(article)){
				ligne.setQuantite(quantite);
			}
		}
	}

	public int dejacommande(Article article){
		if (article == null){
			throw new IllegalArgumentException("Article invalide");
		}
		int ligne;
		for (ligne = 0; ligne < this.listeDeCommandes.size(); ligne++){
			if (listeDeCommandes.get(ligne).getArticle().equals(article)){
				System.out.println(article + "\n-> Cet article a ete commande");
				return ligne;
			} else {
				System.out.println(article + "\n-> Cet article n'a pas encore ete commande");
			}
		}
		return -1;
	}

	public double calculerPrixTotal(){
		double prixTotal = 0;

		for (LigneDeCommande a :listeDeCommandes){
			prixTotal += a.calculerPrixTotal();
		}

		return prixTotal;
	}

	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String infosCommande = date.format(formatter)+" \n";

		for (LigneDeCommande ligne : listeDeCommandes){
			infosCommande += "\n" + ligne.toString() + "\n";
		}
		infosCommande += "\nLe prix total de la commande est de " + calculerPrixTotal() + " €.";
		return infosCommande;
	}
}
