public class TestPersonne {

    public static void main(String[] args) {
        Adresse domicileInconnu = new Adresse(null ,null, null,null);
        Personne andre = new Personne("Bonte", "Andre", 'M', "12.11.03-001.07", domicileInconnu);

        Personne albert = new Personne(andre, "Bonte", "Albert", 'M', "44.06.06-001.90", domicileInconnu);
        Personne marie = new Personne("Leclercq", "Marie", 'F', "47.09.11-002.23", domicileInconnu);

        Adresse domicile1 = new Adresse("Grand rue", "142", "7000", "Mons");
        Personne philou = new Personne(albert, marie, "Bonte", "Philippe", 'M', "70.04.15-001.61", domicile1);
        Personne julie = new Personne("Maes", "Julie", 'F', "73.01.20- 002.65", domicile1);

        Personne elisa = new Personne(philou, julie, "Bonte", "Elizabeth", 'F', "01.10.25-004.16", domicile1);

        System.out.println(elisa);
        System.out.println(albert);
        System.out.println(philou);
        System.out.println(elisa.estDescendant2Degres(philou));
        System.out.println(philou.estDescendant2Degres(andre));
        System.out.println(julie);
    }
}
