public class Tournoi {

    private String nom;

    private Date dateDebut, dateFin;

    private Club clubOrganisateur;

    public Tournoi(String nom, Date dateDebut, Date dateFin, Club clubOrganisateur){
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.clubOrganisateur = clubOrganisateur;
    }

    public Tournoi(String nom, Date dateDebut, Date dateFin){
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public Club getClubOrganisateur() {
        return clubOrganisateur;
    }

    public String toString() {
        if (clubOrganisateur != null){
            return  "Nom du tournoi : " + nom +
                    "\nDate de début : " + dateDebut +
                    "\nDate de fin : " + dateFin +
                    "\nClub organisateur : " + clubOrganisateur;
        } else {
            return  "Nom du tournoi : " + nom +
                    "\nDate de début : " + dateDebut +
                    "\nDate de fin : " + dateFin;
        }
    }
}
