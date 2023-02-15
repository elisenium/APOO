public class Biere extends BoissonAlcoolisee {
    private boolean bouteille;

    public Biere (String nom, int contenance, double prix, double degreAlcool, boolean bouteille){
         super(nom, contenance, prix, degreAlcool);
         this.bouteille = bouteille;
    }

    public boolean isBouteille() {
        return bouteille;
    }

    @Override
    public String toString() {
        if (bouteille == true){
            return "Biere en bouteille : " + super.toString();

        } else if (bouteille == false){
            return "Biere a la pression : " + super.toString();
        }
        return null;
    }
}
