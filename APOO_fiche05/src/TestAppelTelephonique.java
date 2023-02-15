import java.time.Duration;
import java.time.LocalDateTime;

public class TestAppelTelephonique {
    public static void main(String[] args) {
        LocalDateTime dateHeure1 = LocalDateTime.of(2001,10,18,12,06);
        Duration duree1 = Duration.ofSeconds(650);
        AppelTelephonique appel1 = new AppelTelephonique(dateHeure1, "0678564326", duree1);

        LocalDateTime dateHeure2 = LocalDateTime.of(2020,12,24,0,2,33);
        Duration duree2 = Duration.ofSeconds(7000);
        AppelTelephonique appel2 = new AppelTelephonique(dateHeure2, "979035782", duree2, 0.30);

//        System.out.println(appel1.getDureeAppel());
//        System.out.println(appel1.calculerCoutAppelTelephonique());
//        System.out.println(appel1.getNumeroAppel());
//        System.out.println(appel1);
//        System.out.println(appel2);
//        appel1.setTarifMinuteParDefaut(20);
        System.out.println(appel2);
    }
}
