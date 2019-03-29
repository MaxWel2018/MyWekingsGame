package UML.game;

public class Hero extends Person {

    private static int id = 0;
    String name = "";
    int idHero = 0;

    public int getMoney() {
        return money;
    }

    int money = 500;




    public Hero(String name, int strength, int protection, int agility, int skill, int health) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        this.strength = strength;
        this.protection = protection;
        this.agility = agility;
        this.skill = skill;
        this.health = health;
        idHero = id;
        id++;
    }

    public void setArmor(Armor a)  { // установка брони
        armor = a;
        dopStrength += a.getStrength();
        dopProtection += a.getProtection();
        dopAgility += a.getAgility();
        dopSkill += a.getAgility();
        dopHealth += a.getHealth();

    }


    public static void aboutHero(Hero hero) {
        System.out.println(hero);
    }

    public void allCharacteristic() {
        System.out.printf("%s\n " +
                        "\tstrength : %d + %d\n" +
                        "\tprotection : %d + %d\n" +
                        "\tagility : %d + %d\n" +
                        "\tskill : %d + %d\n" +
                        "\thealth : %d + %d\n",
                name,
                strength, dopStrength,
                protection, dopProtection,
                agility, dopAgility,
                skill, dopSkill,
                health, dopHealth);
        System.out.println("Money: " + money);
    }

    @Override
    public String toString() {
        return "" + name + ": \n" +
                "\tstrength : " + strength + "\n" +
                "\tprotection : " + protection + "\n" +
                "\tagility : " + agility + "\n" +
                "\tskill : " + skill + "\n" +
                "\thealth : " + health + "\n";

    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIdHero() {
        return idHero;
    }

    public Hero() {
    }
}
