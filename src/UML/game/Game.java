package UML.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    static Pattern pattern = Pattern.compile("[A-Za-z0-9_]{4,16}");
    static Pattern paternNum = Pattern.compile("^[0-9]$");
    static Matcher matcher;
    static Scanner scanner = new Scanner(System.in);
    static int enter = 0;

    // TODO сделать отдельные классы для менюшек
    public static void run() {
        boolean flag1 = true;
        boolean flag;
        Characteristics.fiilPrice();

        String tempName;
        List<Hero> heroList = new ArrayList<>();
        System.out.println("Добро Пожаловать на битву воинов");
        System.out.print("Укажите имя вашего героя: ");
        do {
            tempName = scanner.nextLine();
            matcher = pattern.matcher(tempName);

            if (matcher.matches()) {
                heroList.add(new Hero(tempName, 5, 5, 5, 5, 5));
            } else {
                System.out.println("Вы Ввели недопустимое имя.Повторите ввод: ");
            }
        } while (!matcher.matches());

        do {
            GameMenu.mainMenu(); // вызов главного меню
            do {
                flag = correctEnter();
            } while (flag);

            if (enter == 1) {  // TODO Сведение о персонаже
                System.out.println("Enter = 1");
            } else if (enter == 2) {  // Арена
                System.out.println("Enter = 2");

            } else if (enter == 3) {   //TODO улучить парам
                do {
                    System.out.println("У вас есть: " + heroList.get(0).getMoney() + " монет.");
                    GameMenu.improveParameter(); // вызов меню-улучш парам.
                    do {
                        int n;
                        flag = correctEnter();  // проверка на вод пункта
                        if (enter == 6) {
                            break;
                        }
                        System.out.println("Введите на сколько хочете улучшить (от 1 - до 9) ?");
                        do {
                            n = enter;
                            flag = correctEnter();// проверка на вод колличестава
                        } while (flag);
                        Characteristics.improveСharacteristics(heroList.get(0), n, enter);

                    } while (flag);
                } while (flag);

            } else if (enter == 4) {  //  TODO Купить амуницию

                    heroList.get(0).setArmor(Armor.getAllArmor(heroList.get(0)));

            } else if (enter == 5) { // TODO Выход
                flag1 = false;
            }

        } while (flag1);
    }

    public static boolean correctEnter() {
        String temp = scanner.nextLine();
        matcher = paternNum.matcher(temp);
        if (matcher.matches()) {
            enter = Integer.parseInt(temp);
            return false;
        } else {
            System.out.println("Не корректный ввод.Повторите попытку");
            return true;
        }

    }


}
