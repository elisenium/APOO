public class TestCercle3 {
    public static void main(String[] args) {
        Point centre = new Point(5.0, 2.0);
        CerclePlace c1 = new CerclePlace(3.0, centre);
        centre.setX(-2.0);
        centre.setY(-3.0);
        System.out.println("Centre de c1 : " + c1.getPointCentre());
        CerclePlace c2 = new CerclePlace(2.0, centre);
        Point centreC1 = c1.getPointCentre();
        centreC1.setX(-4.0);
        System.out.println("Centre de c2 : " + c2.getPointCentre());
    }
}