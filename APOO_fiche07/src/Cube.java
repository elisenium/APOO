public class Cube implements Solide{
    private double cote;

    public Cube(double cote){
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public String toString() {
        return "Cube de cote " + cote;
    }

    @Override
    public double calculerVolume() {
        return Math.pow(cote,3);
    }

    @Override
    public double calculerSurface() {
        return 6 * Math.pow(cote,2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cube cube = (Cube) obj;
        return this.cote == cube.cote;
    }
}
