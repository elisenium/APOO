public class Point {
    private double x,y;

    public  Point(double nX, double nY){
        x = nX;
        y = nY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double nX) {
        x = nX;
    }

    public void setY(double nY) {
        y = nY;
    }

    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
}