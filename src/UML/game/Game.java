package UML.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game  {
    public static void run() {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_]{4,16}$");
        Matcher matcher;
        Scanner scanner = new Scanner(System.in);
        String tempName;
        List<Hero> heroList = new ArrayList<>();
        System.out.println("Добро Пожаловать на битву воинов");
        System.out.println("Укажите имя вашего героя:");
        do {
            tempName = scanner.nextLine();
            matcher = pattern.matcher(tempName);

            if (matcher.matches()) {
                heroList.add(new Hero(tempName, 5, 5, 5, 5, 5));
            }else {
                System.out.println("Вы Ввели недопустимое имя.Повторите ввод: ");
            }
        } while (!matcher.matches());


    }



}
