public class TestAdressePersonne {
    public static void main(String[] args){
        Date date1 = new Date(1968,2,6);
        Date date2 = new Date(1970,3,7);
        Adresse adresse = new Adresse("Rue de la gare", "34","5000", "Namur");
        Personne personne1 = new Personne("Schmidt","Paul",date1, adresse);
        Personne personne2 = new Personne("Gobert","Valérie", date2, adresse);
        System.out.println(personne1);
        System.out.println(personne2);
    }
}