public class TestEchecs {
    public static void main(String[] args) {
        Date date1 = new Date(23,2,2001);
        Date date2 = new Date(17,3,1998);
        Date debut = new Date(2,11,2022);
        Date fin = new Date(6,11,2022);
        Adresse adresse1 = new Adresse("Rue des Pères Noël", "50", "001", "Pôle Nord");
        Adresse adresse2 = new Adresse("Rue des Playmobil", "100", "20001", "Playmoland");
        Club club1 = new Club("202276543", "Les Pères Noël", adresse1);
        Club club2 = new Club("267829725", "Les Michael Jackson", adresse2);
        Joueur joueur1 = new Joueur("2012-08", "Paul", "Lina", date1, club1, 5, 1150);
        Joueur joueur2 = new Joueur("2022-05", "Sanchez", "Kendall", date2, club2, 5, 1150);
        Tournoi tournoi1 = new Tournoi("Olympiades Echecs & Math", debut, fin, club2);
        Parties parties1 = new Parties(debut, joueur1, joueur2, tournoi1);

        /*club1.designerDirecteur(joueur1);
        System.out.println("Directeur : " + club1.getDirecteur().getNom());
        System.out.println(joueur1.getClub());
        club1.supprimerDirecteur();
        System.out.println(club1.getDirecteur());
        joueur1.changerClub(club2);
        System.out.println(joueur1.getClub());
        System.out.println(tournoi1);*/
        //System.out.println(parties1);
       parties1.enregistrerResultat(joueur1);

    }
}
