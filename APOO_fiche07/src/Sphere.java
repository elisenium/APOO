public class Sphere implements Solide{
    private double rayon;

    public Sphere(double rayon){
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return "Sphere de rayon " + rayon;
    }

    @Override
    public double calculerVolume() {
        return 4 * Math.PI * Math.pow(rayon,3) / 3;
    }

    @Override
    public double calculerSurface() {
        return 4 * Math.PI * Math.pow(rayon,2) ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sphere Sphere = (Sphere) obj;
        return this.rayon == Sphere.rayon;
    }
}
