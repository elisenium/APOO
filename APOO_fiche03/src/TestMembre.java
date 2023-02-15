public class TestMembre {

    public static void main(String[] args) {
        Membre membre1 = new Membre("Lecomte", "Emeline", "0545876512");

        //Vérifier false
        //membre1.creerParrain(membre1);
        //Vérifier que membre1 n'a pas de parrain
        //System.out.println(membre1);

        Membre membre2 = new Membre("Cambron", "Isabelle", "6476060689");
        membre1.creerParrain(membre2);
        System.out.println("Parrain de membre 1 : " + membre1.getParrain().getPrenom() + " " + membre1.getParrain().getNom());

        Membre membre3 = new Membre("Baroni", "Raphaël", "08235431678");
        System.out.println("Parrain de membre 1 : " + membre1.getParrain().getPrenom() + " " + membre1.getParrain().getNom());
    }
}
