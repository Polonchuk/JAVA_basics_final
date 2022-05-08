package lesson7cycles.task8;

import java.util.Scanner;

public class UnevenSum {
    public static void main(String[] args) {
        int userFigure = 0;
        int unevenSum = 0;
        int counter = 1;

        Scanner console = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        userFigure = console.nextInt();

        while (counter <= userFigure) {
            if (counter % 2 != 0){
                unevenSum += counter;
            }
            counter++;
        }
        System.out.print("Сумма всех нечетных целых чисел от 1 до " + userFigure + " равна " + unevenSum);
    }
}
