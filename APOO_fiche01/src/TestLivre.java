public class TestLivre {
    public static void main(String[] args){
        Livre livre1 = new Livre("Queen Sugar", 2014, "Nathalie" ,
                "Baszile", 21.35,625, "9780143126232");
        Livre livre2 = new Livre("Chère Ijeawele. Un manifeste pour une éducation féministe",
                2017, "Chimamanda", "Ngozi Adichie" ,
                8.50,84,"9780008275709");

        System.out.println(livre1.titre + ", " + livre1.anneeEdition + ", " + livre1.auteurPrenom + " " + livre1.auteurNom);
        System.out.println();
        System.out.println(livre2.titre + ", " + livre2.anneeEdition + ", " + livre2.auteurPrenom + " " + livre2.auteurNom);
        System.out.println("Prix conseillé : " + livre2.prixConseille + " €");
        System.out.println("Nombre de pages : " + livre2.nombrePages);
        System.out.println("ISBN : " + livre2.ISBN);
    }
}