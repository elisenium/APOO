public class Cylindre implements Solide{
    private double hauteur, rayon;

    public Cylindre(double rayon, double hauteur){
        this.hauteur = hauteur;
        this.rayon = rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return "Cylindre de hauteur " + hauteur + " et de rayon " + rayon;
    }

    @Override
    public double calculerVolume() {
        return Math.PI * Math.pow(rayon, 2) * hauteur;
    }

    @Override
    public double calculerSurface() {
        return 2 * Math.PI * Math.pow(rayon, 2) + 2 * Math.PI * hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cylindre cylindre = (Cylindre) obj;
        return this.rayon == cylindre.rayon && this.hauteur == cylindre.hauteur;
    }
}
