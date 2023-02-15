public class Membre {

	//Ajoutez un attribut pour garder le nom du membre.
	//Ajoutez un attribut pour garder le prénom du membre.
    //Ajoutez un attribut pour garder le numéro de téléphone du membre.
    public String nom, prenom, numero;


    //Ajoutez un attribut pour garder, s'il y en a un, le membre qui a parrainé le membre courant.
	private Membre parrain;
	
	//Ajoutez un constructeur initialisant le nom, le prénom et le numéro de téléphone du membre.
    public Membre(String nom, String prenom, String numero){
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    public Membre(String nom, String prenom, String numero, Membre parrain){
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.parrain = parrain;
    }
	
	//Ajoutez des getters pour tous les attributs

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumero() {
        return numero;
    }

    public Membre getParrain() {
        return parrain;
    }

    //Ajouter un setter pour le numéro de téléphone.

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Ajoutez une méthode permettant d'initialiser le parrain.
	//Cette méthode renvoie false si le membre a déjà un parrain ou si le membre passé en paramètre est le membre lui-même. 
	//Sinon, elle initialise le parrain et renvoie true.

    public boolean creerParrain(Membre parrain){
        if (this.parrain != null || parrain == this) {
            return false;
        } else {
            this.parrain = parrain;
            return true;
        }
    }

	//Ajoutez une méthode toString qui renverra toutes les informations du membre sous forme textuelle. 
	//Si le membre a un parrain, il faut uniquement reprendre le prénom et le nom du parrain. Sinon, il faut dire que le membre n'a pas de parrain.

    @Override
    public String toString() {
        if (this.parrain != null){
            return nom + " " + prenom + "\nNumero de telephone : " + numero + "\nParrain : " + getParrain();
        } else {
            return nom + " " + prenom + "\nNumero de telephone : " + numero + "\nCe membre n'a pas de parrain.";
        }
    }
}
