package UML.game;

public class Armor extends Ammunition   {

    public Armor(String name, int strength, int protection, int agility, int skill, int health) {
        super(name, strength, protection, agility, skill, health);
    }


    public static Armor getShell() {
        return new Armor("Shell",8,10,0,0,0);
    }
}
