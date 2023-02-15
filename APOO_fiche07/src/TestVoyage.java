import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestVoyage {
    public static void main(String[] args) {
        System.out.println("******************** CIRCUIT EUROPE CITY TRIP (test formule circuit) ********************");
        LocalDate dateEtape1 = LocalDate.of(2022,12,10);
        LocalDate dateEtape2 = LocalDate.of(2022,12,13);
        LocalDate dateEtape3 = LocalDate.of(2022,12,18);
        LocalDate dateEtape4 = LocalDate.of(2022,12,23);
        String description = "Le voyage parfait pour découvrir tous les tresors de l'Europe.";
        Circuit circuitEU = new Circuit(dateEtape1, 13, "Europe City Trip",703.77, description);
        Etape etapeEU1 = new Etape("Brussels", dateEtape1);
        Etape etapeEU2 = new Etape("Paris", dateEtape2);
        Etape etapeEU3 = new Etape("Londres", dateEtape3);
        Etape etapeEU4 = new Etape("Rome", dateEtape4);
        circuitEU.ajouter(etapeEU1);
        circuitEU.ajouter(etapeEU2);
        circuitEU.ajouter(etapeEU3);
        circuitEU.ajouter(etapeEU4);
        circuitEU.supprimer(etapeEU3);
        System.out.println(circuitEU);
        System.out.println();

        System.out.println("******************** VOYAGE A BALI EN AVION (test formule sejour) ********************");
        LocalDateTime departBXL_Bali = LocalDateTime.of(2021,1,23,15,45);
        LocalDateTime retourBali_BXL = LocalDateTime.of(2021,2,5,10,15);
        LocalDate depart = LocalDate.of(2021,1,23);
        Vol volAllerBXL_Bali = new Vol(departBXL_Bali, 520, "23HGD", "Bruxelles","Bali");
        Vol volRetourBali_BXL = new Vol(retourBali_BXL, 734, "DJ873", "Bali", "Bruxelles");
        Hotel reservationBali = new Hotel("Plazza Deluxe", 5, 20.5);
        Sejour sejourBali = new Sejour(depart,13, volAllerBXL_Bali, volRetourBali_BXL,reservationBali);
        System.out.println(sejourBali);
        System.out.println();

        System.out.println("******************** VOYAGE A BALI EN AVION (test formule simple) ********************");
        FormuleSimple sejourBaliSimple = new FormuleSimple(depart,13, volAllerBXL_Bali, volRetourBali_BXL);
        System.out.println(sejourBaliSimple);
        System.out.println();

        System.out.println("******************** CROISIERE DANS LES CARAIBES (test formule croisiere) ********************");
        LocalDate departCroisiere = LocalDate.of(2022,3,1);
        Bateau bateau = new Bateau("Pirate des Caraibes", 300);
        Croisiere croisiere = new Croisiere(departCroisiere, 9, "Carribean Cruise", 1345.94, bateau);
        String etape1 = "Movie Night";
        String etape2 = "Cours de Zumba";
        String etape3 = "Pilates";
        String etape4 = "Spectacle";

        bateau.ajouter(etape1);
        bateau.ajouter(etape2);
        bateau.ajouter(etape3);
        bateau.ajouter(etape4);
        bateau.supprimer(etape1);
        System.out.println(croisiere);
    }
}
