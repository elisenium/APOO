public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("0000-000", "Kafka", "Le monde est petit", 500,12.5, 2020);
        Livre livre2 = new Livre("2291-2827", "Zola", "Lola", 789, 13,2010);
        Livre livre3 = new Livre("0000-000", "Kafka", "Le monde est petit", 500,12.5, 2020);

        System.out.println(livre1.equals(livre2));
        System.out.println(livre3.equals(livre1));
        System.out.println(livre3.equals(livre2));
    }
}
