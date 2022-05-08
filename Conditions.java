package lesson6conditions.task4;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        float avgValue;
        int RoundedDown;

        Scanner console = new Scanner(System.in);

        System.out.print("Введите первое из трех чисел: ");
        first = console.nextInt();

        System.out.print("Введите второе из трех чисел: ");
        second = console.nextInt();

        System.out.print("Введите третье из трех чисел: ");
        third = console.nextInt();

        avgValue = (first + second + third)/3;
        System.out.println("Среднее арифметическое введенных чисел равно: " + avgValue);

        RoundedDown = (int)avgValue/2; //приводя величину к целому числу, мы отбрасываем остаток от деления, что и требуется по условию.

        if (RoundedDown > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
