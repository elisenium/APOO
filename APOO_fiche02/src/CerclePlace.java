
public class CerclePlace {
    private double rayon;
    private Point pointCentre;

    public  CerclePlace(double rayon, Point pointCentre){
        this.rayon = rayon;
        this.pointCentre = pointCentre;
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
