package lesson9final.task4;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Отгадайте: <Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает>.");
        System.out.println("Вы можете воспользоваться подсказкой, если введете <Подсказка>, но только до первой попытки.");

        int attempts = 3;
        boolean gotHint = false;
        boolean rightAnswer = false;

        while (attempts > 0) {
            System.out.println("Введите строку с ответом. У вас " + attempts + " попытки.\n");
            String input = console.nextLine();
            if (input.equals("Подсказка")) {
                if (attempts == 3) {
                    System.out.println("Речь идет о вредоносном ПО.");
                    gotHint = true;
                }
                else {
                    System.out.println("Подсказка уже не доступна.");
                }
                continue;
            }
            if (input.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                rightAnswer = true;
                break;
            }
            else {
                if (gotHint) {
                    break;
                }
                if (attempts > 1) {
                    System.out.println("Подумай еще!");
                }
            }
        attempts--;
        }
        if (rightAnswer != true) {
            System.out.println("Обидно! Приходи в другой раз.");
        }
    }
}
