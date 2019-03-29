package UML.game;

import java.util.Scanner;

public class Armor extends Ammunition {
    public Armor(String name, int strength, int protection, int agility, int skill, int health, int price) {
        super(name, strength, protection, agility, skill, health, price);

    }


    public static Armor getShell() {
        return new Armor("Shell", 8, 10, 0, 0, 0, 300);
    }

    public static Armor getBaidana() {
        return new Armor("Baidana", 15, 25, 0, 0, 0, 650);
    }

    public static Armor getLinotrax() {
        return new Armor("Linotrax", 21, 30, 0, 0, 0, 1020);
    }

    public static Armor getBrigantine() {
        return new Armor("Brigantine", 6, 60, 0, 21, 0, 1200);
    }


    public static Armor getAllArmor(Hero hero) { // TODO разобраться  с NULL , и заполнить текстом вы купили ....
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы можете приобрести:");
        System.out.println();
        showArmor(getShell());
        showArmor(getBaidana());
        showArmor(getLinotrax());
        showArmor(getBrigantine());
        int n = scanner.nextInt();
        if (n == 1) {
            if (hero.getMoney() >= getShell().getPrice()) {
                hero.money -= getShell().getPrice();
                return getShell();
            }
            else{
                System.out.println("Недостаточно средств");
                return null;
            }
        } else if (n == 2) {
            if (hero.getMoney() >= getBaidana().getPrice()) {
                hero.money -= getBaidana().getPrice();
                return getBaidana();
            } else{
                System.out.println("Недостаточно средств");
                return null;

            }
        } else if (n == 3) {
            if (hero.getMoney() >= getLinotrax().getPrice()) {
                hero.money -= getLinotrax().getPrice();
                return getLinotrax();
            } else{
                System.out.println("Недостаточно средств");
                return null;

            }
        } else if (n == 4) {
            if (hero.getMoney() >= getBrigantine().getPrice()) {
                hero.money -= getBrigantine().getPrice();
                return getBrigantine();
            } else{
                System.out.println("Недостаточно средств");
                return null;

            }
        }else {
            return null;
        }
    }

    private static void showArmor(Armor a) {
        System.out.printf("%s\n\tСила: %d\n\tЗащита:  %d\n\tЛовкость  %d\n\tМакстерство  %d\n\tЖивучесть %d\n\t\n\tЦена  %d\n", a.getName(), a.getStrength(), a.getProtection(), a.getAgility(), a.getSkill(), a.getHealth(), a.getPrice());
        System.out.println("Для покупки нажмите: " + a.getId());
        System.out.println("-----------------------------------------------------");

    }
}

