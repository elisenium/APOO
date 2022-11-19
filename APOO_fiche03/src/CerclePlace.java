
public class CerclePlace {
    private double rayon;
    private Point pointCentre;

    public CerclePlace(double rayon, Point pointCentre){
        this.rayon = rayon;
        this.pointCentre = pointCentre;
    }

    public CerclePlace CercleDeRayon1(Point pointCentre){
        this.rayon = 1;
        this.pointCentre = pointCentre;
        return CercleDeRayon1(pointCentre);
    }

    public CerclePlace CercleRayon1Centre0(){
        rayon = 1;
        pointCentre.setX(0);
        pointCentre.setY(0);
        return CercleRayon1Centre0();
    }

    public double getRayon() {
        return rayon;
    }

    public Point getPointCentre() {
        return pointCentre;
    }

    public void setRayon(double nRayon) {
        rayon = nRayon;
    }

    public void setPointCentre(Point pointCentre) {
        this.pointCentre = pointCentre;
    }

    public String toString(){

        return "Le cercle est de rayon " + getRayon() + " et de centre " + getPointCentre() ;
    }
}
