package UML.game;

public abstract class Ammunition {
    private int price;
    private String name;
    private int strength;
    private int protection;
    private int agility;
    private int skill;
    private int health;
    private static int id=0;
    private  int idArmor=0;

    public int getPrice() {
        return price;
    }

    public Ammunition(String name, int strength, int protection, int agility, int skill, int health, int price) {
        if(!name.equals("")){
            this.name = name;
        }
        this.strength = strength;
        this.protection = protection;
        this.agility = agility;
        this.skill = skill;
        this.health = health;
        this.price = price;
        id++;
        idArmor = id;
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

    public int getId() {
        return id;
    }
}
