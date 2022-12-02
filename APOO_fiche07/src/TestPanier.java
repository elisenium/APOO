public class TestPanier {
    public static void main(String[] args) {
        Panier panier = new Panier();
        Livre livre1 = new Livre("379203", 13.2,"The Bridgerton", "Lolapalooza", 500);
        Livre livre2 = new Livre("793682", 17.8, "Queen Sugar", "Natalie Baszilz", 567);
        Dvd dvd = new Dvd("7293628", 22,"Django Unchained", "Quentin Tarantino");
        Cd cd = new Cd("392736383", 20,"Thriller", "Michael Jackson", 9);

        panier.ajouter(livre1);
        panier.ajouter(livre2);
        panier.ajouter(dvd);
        panier.ajouter(cd);

        System.out.println(panier);
    }
}
