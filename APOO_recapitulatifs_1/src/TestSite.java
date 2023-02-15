public class TestSite {
    public static void main(String[] args) {
        Site site = new Site("www.supercontent.com");
        Film film1 = new Film("Avengers: Endgame", "action", 181, 279800000);
        Serie serie1 = new Serie("The Big Bang Theory", "comédie", 279);
        Film film2 = new Film("Avengers: Endgame", "action", 143);
        Film film3 = new Film("Avengers: Endgame", "superhéros", 181, 279800000);

        site.ajouter(film1);
        site.ajouter(serie1);
        site.ajouter(film2);
        site.ajouter(film3);
        System.out.println(site);
    }
}
