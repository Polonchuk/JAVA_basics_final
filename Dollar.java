package lesson9final.task1;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара (разделитель - запятая): ");
        double currentRate = console.nextDouble();

        System.out.println("Введите сумму в рублях: ");
        double sumInRub = console.nextDouble();

        double convResult = sumInRub/currentRate;
        double convResRounded = (double)(Math.round(convResult*100.0)/100.0);
        System.out.println("- Курс доллара: " + currentRate);
        System.out.println("- Количество рублей: " + sumInRub);
        System.out.println("- Итого: " + convResRounded + " долларов.");
    }
}
