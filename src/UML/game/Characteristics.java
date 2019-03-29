package UML.game;

import java.util.Scanner;

public  class  Characteristics {
    private static int priceTX[] = new int[1000];
    public static void fiilPrice() {
        for (int i = 0; i < 1000; i++) {
            priceTX[i] = (int) (i * 1.3);
        }
    }
    public static void improveСharacteristics(Hero h,int n, int k) {


        //1 strength
        //2 protection
        //3 agility
        //4 skill
        //5 health
        int sumCost = 0;
        int temp;
        Scanner scanner= new Scanner(System.in);

        switch (n) {
            case 1:
                for (int i = h.strength; i <  h.strength + k; i++) {   // сумируем стоимость улучшения на К раз
                    sumCost += priceTX[ h.strength];
                }
                System.out.println("Для улучшения нужно: " + sumCost +  " Монет" );
                System.out.println("Для потверждения нажмите - 1 . Для отмены - 2");
                temp = scanner.nextInt();
                if (temp==1&& h.money > sumCost &&  h.strength != 1000) {  // проверяем хватает ли денег
                    h.strength++;                                           // и не достигнут ли мак уровень
                    h.money -= sumCost;
                    System.out.println("Вы улучшили силу на: " + k);
                    if ( h.strength == 1000) {
                        System.out.println("Вы достигли предела Силы!Поздравляю");
                    }
                } else if (temp == 2) {
                    break;
                } else {
                    System.out.println("Не хватает денег!У вас: " + h.money);
                }
                break;
            case 2:
                for (int i = h.protection; i < h.protection + k; i++) {
                    sumCost += priceTX[h.protection];
                }
                System.out.println("Для улучшения нужно: " + sumCost );
                System.out.println("Для потверждения нажмите - 1 . Для отмены - 2");
                temp = scanner.nextInt();
                if (temp==1&&h.money > priceTX[h.protection] && h.protection != 1000) {
                    h.protection++;
                    h.money -= sumCost;
                    System.out.println("Вы улучшили Защиту на: " + k);

                    if (h.protection == 1000) {
                        System.out.println("Вы достигли предела Защиты!Поздравляю");
                    }
                }
                else if (temp == 2) {
                    break;
                } else {
                    System.out.println("Не хватает денег!У вас: " + h.money);
                }
                break;
            case 3:
                for (int i = h.agility; i < h.agility + k; i++) {
                    sumCost += priceTX[h.agility];
                }
                System.out.println("Для улучшения нужно: " + sumCost );
                System.out.println("Для потверждения нажмите - 1 . Для отмены - 2");
                temp = scanner.nextInt();
                if (temp==1&&h.money > priceTX[h.agility] && h.agility != 1000) {
                    h.agility++;
                    h.money -= sumCost;
                    System.out.println("Вы улучшили Ловкость на: " + k);

                    if (h.agility == 1000) {
                        System.out.println("Вы достигли предела Ловкости!Поздравляю");
                    }
                }
                else if (temp == 2) {
                    break;
                } else {
                    System.out.println("Не хватает денег!У вас: " + h.money);
                }
                break;
            case 4:
                for (int i = h.skill; i < h.skill + k; i++) {
                    sumCost += priceTX[h.skill];
                }
                System.out.println("Для улучшения нужно: " + sumCost );
                System.out.println("Для потверждения нажмите - 1 . Для отмены - 2");
                temp = scanner.nextInt();
                if (temp==1&&h.money > priceTX[h.skill] && h.skill != 1000) {
                    h.skill++;
                    h.money -= sumCost;
                    System.out.println("Вы улучшили Мастерство на: " + k);

                    if (h.skill == 1000) {
                        System.out.println("Вы достигли предела Мастерства!Поздравляю");
                    }
                } else if (temp == 2) {
                    break;
                } else {
                    System.out.println("Не хватает денег!У вас: " + h.money);
                }
                break;

            case 5:
                for (int i = h.health; i < h.health + k; i++) {
                    sumCost += priceTX[h.health];
                }
                System.out.println("Для улучшения нужно: " + sumCost );
                System.out.println("Для потверждения нажмите - 1 . Для отмены - 2");
                temp = scanner.nextInt();
                if (temp==1&&h.money > priceTX[h.health] && h.health != 1000) {
                    h.health++;
                    h.money -= sumCost;
                    System.out.println("Вы улучшили Живучесть на: " + k);

                    if (h.health == 1000) {
                        System.out.println("Вы достигли предела Здоровья!Поздравляю");
                    }
                } else if (temp == 2) {
                    break;
                } else {
                    System.out.println("Не хватает денег!У вас: " +h.money);
                }
                break;
            default:
                System.out.println("Не правильный ввод.");
                break;
        }


    }
}
