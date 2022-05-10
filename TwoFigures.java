package lesson8dataprocess.task11;

import java.util.Scanner;

public class TwoFigures {
    public static void main(String[] args) {

        String firstStr;
        int secondFig;
        Scanner console = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        firstStr = console.nextLine();
        int firstFig = Integer.parseInt(firstStr);

        System.out.print("Введите второе целое число: ");
        secondFig = console.nextInt();

        System.out.print("Большее из двух введенных чисел: " + Math.max(firstFig, secondFig) + "\n");

        double minFig = Math.min(firstFig, secondFig);
        System.out.print("Меньшее из двух введенных чисел: " + minFig);
    }
}
