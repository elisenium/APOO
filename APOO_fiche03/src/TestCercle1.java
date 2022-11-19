public class TestCercle1 {
    public static void main(String[] args) {
        Point centre = new Point(5.0, 2.0);
        CerclePlace c1 = new CerclePlace(3.0, centre);
        double rayon = c1.getRayon();
        rayon = 6.0;
        System.out.println("Rayon de c1 : " + c1.getRayon());
        System.out.println("Rayon de c1 : " + c1.getRayon());
        centre = c1.getPointCentre();
        centre = new Point(4.0,-2.0);
        System.out.println("Centre de c1 : " + c1.getPointCentre());

    }
}