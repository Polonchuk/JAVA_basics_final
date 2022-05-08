package lesson6conditions.task5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int first;
        int second;
        String operation;
        float result = 0;
        boolean wrongOperation = false;

        Scanner consoleInt = new Scanner(System.in);
        Scanner consoleStr = new Scanner(System.in); // прочел в сети рекоммендацию заводить отдельные "сканеры" для строк и для числовых значений...

        System.out.print("Введите первое из двух целых чисел: ");
        first = consoleInt.nextInt();

        System.out.print("Введите одну из возможных операций, - '+', '-' ,'*' или '/': ");
        operation = consoleStr.nextLine();

        System.out.print("Введите второе из двух целых чисел: ");
        second = consoleInt.nextInt();
        
        if (operation.equals("+")) {
            result = first + second;
        }
        else if (operation.equals("-")) {
            result = first - second;
        }
        else if (operation.equals("*")) {
            result = first * second;
        }
        else if (operation.equals("/")) {
            result = first + second;
        }
        else {
            System.out.println("Введенная вами операция " + operation + " не реализована.");
            wrongOperation = true;
        }
        if (wrongOperation == false) {
            System.out.println("Результат вычисления: " + result);
        }
    }
}
