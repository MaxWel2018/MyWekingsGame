package UML.game;

public abstract class Person {


    int strength = 5;
    int protection = 5;
    int agility = 5;
    int skill = 5;
    int health = 5;
    int dopStrength = 0;
    int dopProtection = 0;
    int dopAgility = 0;
    int dopSkill = 0;
    int dopHealth = 0;
    Armor armor;


    public int getStrength() {
        return strength;
    }

    public int getProtection() {
        return protection;
    }

    public int getAgility() {
        return agility;
    }

    public int getSkill() {
        return skill;
    }

    public int getHealth() {
        return health;
    }

    public int getDopStrength() {
        return dopStrength;
    }

    public int getDopProtection() {
        return dopProtection;
    }

    public int getDopAgility() {
        return dopAgility;
    }

    public int getDopSkill() {
        return dopSkill;
    }

    public int getDopHealth() {
        return dopHealth;
    }

}
