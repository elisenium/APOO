public class TestPersonne {
    public static void main(String[] args){
        Personne personne1 = new Personne("Grelaud", "Elise", 18, 10,2001,"Rue des Quatre-Vents","144",1080,"Bruxelles");

        System.out.println("D'ici la fin de l'année 2022, " + personne1.prenom + " aura " + personne1.calculerAgeFinDAnnee() + " ans.");
        System.out.println("Le 31 décembre de cette année-là, " + personne1.prenom + " a/aura " + personne1.calculerAgeAnnee() + " ans.");
        System.out.println(personne1.prenom + " habite " + personne1.rue + ", " + personne1.numero + ", " + personne1.codePostale + " " + personne1.nomVille + ".");
        System.out.println(personne1.prenom + " est né(e) le " + personne1.jour + "/" + personne1.mois + "/" + personne1.annee + ".");
    }
}