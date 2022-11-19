public class Joueur {

    private String matricule, nom, prenom;

    private Date dateNaissance;

    private Club club;

    private int nbreParties, pointsElo;

    public Joueur(String matricule, String nom, String prenom, Date dateNaissance, Club club, int nbreParties, int pointsElo){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.club = club;
        this.nbreParties = nbreParties;
        this.pointsElo = pointsElo;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public Club getClub() {
        return club;
    }

    public int getPointsElo() {
        return pointsElo;
    }

    public int getNbreParties() {
        return nbreParties;
    }

    public void modifierPointsElo(){
        pointsElo = 1150;
        pointsElo++;
    }

    public void changerClub(Club club){
        if (club == getClub()) {
            System.out.println("Le joueur fait déjà parti de ce club");
        } else {
            this.club = club;
        }
    }

    public String toString() {
        return "Matricule : " + matricule +
                "\nJoueur : " + prenom + " " + nom +
                "\nDate de Naissance : " + dateNaissance +
                "\nClub : " + club.getNom() +
                "\nNombre de parties : " + nbreParties +
                "\nPoints Elo : " + pointsElo;

    }
}
