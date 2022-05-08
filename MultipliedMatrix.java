package lesson7cycles.task10;

import java.util.Scanner;

public class MultipliedMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rowsNum = 1;
        int rowRange = 1;

        System.out.print("Введите количество строк массива (больше нуля): ");
        rowsNum = console.nextInt();
        System.out.print("Введите количество столбцов массива (больше нуля): ");
        rowRange = console.nextInt();

        double[][] userMatrix = new double[rowsNum][rowRange];

        for (int i = 1; i <= rowsNum; i++) {
            for (int ii = 1; ii <= rowRange; ii++) {
                System.out.print("Введите " + ii + " элемент строки " + ii + " массива (для дробного числа разделитель - запятая): ");
                userMatrix[i - 1][ii - 1] = console.nextDouble();
            }
        }

        for (int ii = 1; ii <= userMatrix[0].length; ii++) {
            System.out.print("Утроенная величина " + ii + "-го элемента первой строки массива равна: " + userMatrix[0][ii - 1] * 3 + "\n");
        }
    }
}
