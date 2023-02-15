
public class Magipl {
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        Terrain terrain = new Terrain('b');
        Creature creature = new Creature(6, "Golem", 4, 6);
        Sortilege sortilege = new Sortilege(1,"Croissance", "Gigantesque");

        main1.piocher(terrain);

        main2.piocher(terrain);

        System.out.println(main1);

        System.out.println(main2);

        /*main1.piocher(creature);

        System.out.println(main1);

        main1.piocher(sortilege);

        System.out.println(main1);

        System.out.println(main1.jouer(1));

        System.out.println(main1);

        System.out.println(main1.jouer(1));

        System.out.println(main1);*/


    }
}
