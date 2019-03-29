package UML.game;

public class GameMenu {

    public static void mainMenu(){
        System.out.println("Добро пожаловать в главное меню!");  // TODO главное меню
        System.out.println("\t\t1 - Сведение о персонаже.");
        System.out.println("\t\t2 - Арена.");
        System.out.println("\t\t3 - Улучшить параметры.");
        System.out.println("\t\t4 - Купить амуницию.");
        System.out.println("\t\t5 - Выход.");
        System.out.print("Выберите пункт меню: ");
    }

    public static void improveParameter() {
        System.out.println("Какой параметр желаете улучшить?");
        System.out.println("\t\t1 - Силу.");
        System.out.println("\t\t2 - Защиту");
        System.out.println("\t\t3 - Ловкость");
        System.out.println("\t\t4 - Мастертсво");
        System.out.println("\t\t5 - Живучесть.");
        System.out.println();
        System.out.println("\t\t6 - Вернуться назад.");
        System.out.print("Выберите пункт меню: ");
    }


}
