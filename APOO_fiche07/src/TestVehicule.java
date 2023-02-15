import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class TestVehicule {

    public static void main(String[] args) {
        /*LocalDate date1 = LocalDate.of(2019,5,23);
        Voiture voiture = new Voiture("ELISE555", date1);
        System.out.println(voiture.estEnOrdre());*/

        LocalDate date2 = LocalDate.of(2020,6,30);
        Utilitaire utilitaire = new Utilitaire("35DJH98", date2, 5000);
        System.out.println(utilitaire.estEnOrdre());
    }
}
