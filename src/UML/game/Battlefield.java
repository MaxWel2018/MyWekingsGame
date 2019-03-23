package UML.game;

public class Battlefield {
    private static int random1;
    private static int random2;

    public static void battle(Hero h1, Person h2) {
        int h1Damage = (int) (((0.3 + Math.random() * 0.25) * (h1.getStrength() + h1.getDopStrength())) * 3);
        int h2Damage = (int) (((0.3 + Math.random() * 0.25) * (h2.getStrength() + h2.getDopStrength())) * 3);

        random1 = (int) (1 + Math.random() * 100);
        random2 = (int) (1 + Math.random() * 100);
        if (random1 <= 5) {  // крит урон
            h1Damage *= 2;
            System.out.println("Крииииит герой 1 ");
        }
        if (random2 <= 5) { // крит урон
            h2Damage *= 2;
            System.out.println("Крииииит Герой 2");

        }


    }

}
