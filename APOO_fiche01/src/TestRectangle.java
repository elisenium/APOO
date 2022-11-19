public class TestRectangle {

    public static void main(String[] args){

        Rectangle rectangle1 = new Rectangle(5,3);
        Rectangle rectangle2 = new Rectangle(10,6);
        Rectangle rectangle3 = new Rectangle(8,3);
        System.out.println("L'aire du premier rectangle est de " + rectangle1.calculerAire() + " cm^2.");
        System.out.println("Le périmètre du second rectangle est de " + rectangle2.calculerPerimetre() + " cm.");
        System.out.println(rectangle3);
    }
}