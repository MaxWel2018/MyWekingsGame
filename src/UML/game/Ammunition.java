package UML.game;

public abstract class Ammunition {
    private String name;
    private int strength;
    private int protection;
    private int agility;
    private int skill;
    private int health;

    public Ammunition(String name, int strength, int protection, int agility, int skill, int health) {
        if(!name.equals("")){
            this.name = name;
        }
        this.strength = strength;
        this.protection = protection;
        this.agility = agility;
        this.skill = skill;
        this.health = health;
    }

    public String getName() {
        return name;
    }

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
}
