public class Livre {
    String ISBN;
    String titre;
    int anneeEdition;
    String auteurPrenom;
    String auteurNom;
    double prixConseille;
    int nombrePages;

    Livre(String nouveauTitre, int nouvelleAnneeEdition,
          String nouveauAuteurPrenom, String nouveauAuteurNom,
          double nouveauPrixConseille, int nouveauNombrePages, String nouvelISBN){

        titre = nouveauTitre;
        anneeEdition = nouvelleAnneeEdition;
        auteurPrenom = nouveauAuteurPrenom;
        auteurNom = nouveauAuteurNom;
        prixConseille = nouveauPrixConseille;
        nombrePages = nouveauNombrePages;
        ISBN = nouvelISBN;
    }
}
