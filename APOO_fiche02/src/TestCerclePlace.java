public class TestCerclePlace {
    public static void main(String[] args){
        Point point = new Point(4,2.5);
        CerclePlace cercle1 = new CerclePlace(4,point);
        CerclePlace cercle2 = new CerclePlace(12.5,point);

        //Sans modification
        System.out.println(cercle1);
        System.out.println(cercle2);

        //Avec modification
        System.out.println("\n" + cercle1);
        point.setX(8);
        System.out.println(cercle2);
    }
}
