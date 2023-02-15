import java.util.Scanner;
public class Personne {
    public static Scanner Scanner = new Scanner(System.in);
    String nom;
    String prenom;
    int jour;
    int mois;
    int annee;
    String rue;
    String numero;
    int codePostale;
    String nomVille;
    int ageFinAnnee;
    int ageAnnee;
    int calculAnnee;

    Personne(String nouveauNom, String nouveauPrenom, int nouveauJour, int nouveauMois, int nouvelleAnnee,
             String nouvelleRue, String nouveauNumero, int nouveauCodePostale, String nouveauNomVille){
        nom = nouveauNom;
        prenom = nouveauPrenom;
        jour = nouveauJour;
        mois = nouveauMois;
        annee = nouvelleAnnee;
        rue = nouvelleRue;
        numero = nouveauNumero;
        codePostale = nouveauCodePostale;
        nomVille = nouveauNomVille;
    }

    int calculerAgeFinDAnnee(){
        ageFinAnnee = 2022 - annee;
        return ageFinAnnee;

    }
    int calculerAgeAnnee(){
        System.out.print("En quelle année voulez-vous connaître l'âge de la personne ? ");
        calculAnnee = Scanner.nextInt();
        ageAnnee = calculAnnee - annee;
        return ageAnnee;
    }
}