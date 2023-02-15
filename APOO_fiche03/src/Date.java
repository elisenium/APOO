public class Date {

    private int jour, mois, annee;

    public Date(int jour,int mois,int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getjour() {
        return jour;
    }

    public int getmois() {
        return mois;
    }

    public int getannee() {
        return annee;
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }
}
