public class TestArticle {
    public static void main(String[] args) {
        try {
            Article article1 = new Article("26578-25682", "Pantalon noir","Joli pantalon noir à porter pour les grandes occasions", 59);
            Article article2 = new Article("2587-3546", "T-shirst blanc", "blablabla...", 15, 125);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
