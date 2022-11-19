public class TestCompteEnBanque {
    public static void main(String[] args){
        //Personne 1
        Date dateNaissance1 = new Date(1999,10,22);
        Date dateValidite1 = new Date(2027, 06,1);
        Date dateOuverture1 = new Date(2020,8,12);
        Adresse adresse1 = new Adresse("Rue des Peres Noel", "89A", "182978", "Ciel");
        Personne personne1 = new Personne("Lemaire", "Lucas", dateNaissance1, adresse1);
        CompteEnBanque compte1 = new CompteEnBanque(personne1, dateValidite1, "000-000000089-89", dateOuverture1, 1200);

        //Personne 2
        Date dateNaissance2 = new Date(2001,3,22);
        Date dateValidite2 = new Date(2033, 4,2);
        Date dateOuverture2 = new Date(2022,12,3);
        Adresse adresse2 = new Adresse("Rue des Peres Elfs", "182", "16728", "Ciel");
        Personne personne2 = new Personne("Colombo", "Giselle", dateNaissance2, adresse2);
        CompteEnBanque compte2 = new CompteEnBanque(personne2, dateValidite2, "000-023460067-09", dateOuverture2, 10000);

        //Tests
        compte1.retraitMontant(100);
        System.out.println(compte1);
        compte1.depotMontant(5000);
        System.out.println(compte1);
        compte1.virement(2000, compte2);
        System.out.println(compte1);
        System.out.println(compte2);
    }
}