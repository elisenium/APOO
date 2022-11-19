public class Rectangle {
    double aire;
    double perimetre;
    double longueur;
    double largeur;

    Rectangle(double nouvelleLongueur, double nouvelleLargeur){
        longueur = nouvelleLongueur;
        largeur = nouvelleLargeur;
    }

    double calculerAire(){
        aire = longueur * largeur;
        return aire;
    }

    double calculerPerimetre(){
        perimetre = 2 * largeur + 2 * longueur;
        return perimetre;
    }

    public String toString(){
        return "Rectangle de longueur " + longueur + " cm et de largeur " + largeur + " cm.";
    }
}