import java.util.Scanner; //pour importer la bibliothèque Scanner
public class Personne {
    public static Scanner scanner = new Scanner(System.in);
    private String nom, prenom;
    private int anneeNaissance, moisNaissance, jourNaissance;
    private Adresse domicile;
    private Date dateNaissance;

    public Personne (String nNom, String nPrenom, Date nDateNaissance, Adresse nDomicile){
        nom = nNom;
        prenom = nPrenom;
        domicile = nDomicile;
        dateNaissance = nDateNaissance;
    }
    public int calculerAge(){
        return 2022 - anneeNaissance;
    }

    public int calculerAgeEn(){
        System.out.print("En quelle année voulez-vous calculer l'âge de la personne ? ");
        int annee = scanner.nextInt();
        return annee - anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getDomicile(){
        return domicile;
    }

    public Date getDateNaissance(){
        return dateNaissance;
    }

    public void demenager(String rue, String numero, String codePostal, String ville){
        domicile = new Adresse(rue, numero, codePostal, ville);
    }

    public String toString(){
        return getPrenom() + " " + getNom() + " né(e) le " + getDateNaissance() + " et dont le domicile est " + getDomicile() + ".";
    }
}