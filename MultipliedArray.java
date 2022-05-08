package lesson7cycles.task9;

import java.util.Scanner;

public class MultipliedArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int arrayRange = 1;
        double avgValue = 0;
        double arraySum = 0;

        System.out.print("Введите количество элементов массива (больше нуля): ");
        arrayRange = console.nextInt();

        double[] userArray = new double[arrayRange];

        for (int i = 1; i <= arrayRange; i++) {
            System.out.print("Введите " + i + " элемент массива (для дробного числа разделитель - запятая): ");
            userArray[i - 1] = console.nextDouble();
            arraySum += userArray[i - 1];

        }
        avgValue = arraySum / arrayRange;

        for (int i = 1; i <= arrayRange; i++) {
            System.out.print("Произведение " + i + "-го элемента массива и среднего арифметического массива равно: " + userArray[i - 1]*avgValue + "\n");
        }
    }
}
