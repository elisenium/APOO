public class Parties {

    private Date date;
    private Joueur joueurBlanc, joueurNoir;
    private Tournoi tournoi;
    private int pointsJoueurBlanc, pointsJoueurNoir;

    public Parties(Date date, Joueur joueurBlanc, Joueur joueurNoir, Tournoi tournoi){
        this.date = date;
        this.joueurBlanc = joueurBlanc;
        this.joueurNoir = joueurNoir;
        this.tournoi = tournoi;
        this.pointsJoueurBlanc = enregistrerResultatUnePartie();
        this.pointsJoueurNoir = enregistrerResultatUnePartie();
    }

    public Date getDate() {
        return date;
    }

    public Joueur getJoueurBlanc() {
        return joueurBlanc;
    }

    public Joueur getJoueurNoir() {
        return joueurNoir;
    }

    public Tournoi getTournoi() {
        return tournoi;
    }

    public int getPointsJoueurBlanc() {
        return pointsJoueurBlanc;
    }

    public int getPointsJoueurNoir() {
        return pointsJoueurNoir;
    }

    public int enregistrerResultatUnePartie() {
        pointsJoueurBlanc = unEntierAuHasardEntre(0,1);
        pointsJoueurNoir = unEntierAuHasardEntre(0,1);

        if (pointsJoueurBlanc == 1 && pointsJoueurNoir == 0){
            System.out.println(joueurBlanc.getPrenom() + " " + joueurBlanc.getNom() + " a gagné ! " + joueurNoir.getPrenom() + " " + joueurNoir.getNom() + " a perdu...");

        } else if (pointsJoueurNoir == 1 && pointsJoueurBlanc == 0) {
            System.out.println(joueurNoir.getPrenom() + " " + joueurNoir.getNom() + " a gagné ! " + joueurBlanc.getPrenom() + " " + joueurBlanc.getNom() + " a perdu...");

        } else {
            System.out.println("null");
        }
        return 0;
    }

    public int enregistrerResultat(Joueur joueur) {
        for (int i = 0; i <= joueur.getNbreParties(); i++){
            enregistrerResultatUnePartie();
        }
        return 0;
    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;
        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
        return resultat;
    }

    public String toString() {
        return "Tournoi : " + tournoi.getNom() +
                "\nJoueur blanc : " + joueurBlanc.getPrenom() + " " + joueurBlanc.getNom() +
                "\nJoueur noir : " + joueurNoir.getPrenom() + " " + joueurNoir.getNom();
    }


}