package lesson6conditions.task6;

import java.util.Scanner;

public class UnitsConversion {
    public static void main(String[] args) {
        int valueCategory;
        int valueType = 0;
        float valueAmount = 0;
        double result_1 = 0;
        double result_2 = 0;
        double result_3 = 0;
        boolean wrongOption = false;

        Scanner console = new Scanner(System.in);

        System.out.print("Какая категория величин вас интересует? Введите '1' для величин массы или '2' для единиц расстояния: ");
        valueCategory = console.nextInt();
        switch (valueCategory) {
            case 1:
                System.out.print("Укажите единицу измерения: 1 - килограмм, 2 - пуд, 3 - фунт (англ.), 4 - унция: ");
                valueType = console.nextInt();
                break;
            case 2:
                System.out.print("Укажите единицу измерения: 1 - метр, 2 - миля (морская), 3 - ярд, 4 - фут: ");
                valueType = console.nextInt();
                break;
            default:
                System.out.print("Не предусмотренная категория величин.");
                wrongOption = true;
        }
        if (!wrongOption) {
            System.out.print("Введите количество указанных единиц: ");
            valueAmount = console.nextFloat();

            if (valueCategory==1 && valueType==1) {
                result_1 = valueAmount / 16.38;
                result_2 = valueAmount / 0.4536;
                result_3 = valueAmount / 0.02835;
                System.out.print("Килограммов: " + valueAmount +
                        "\nПудов:" + result_1 +
                        "\nФунтов:" + result_2 +
                        "\nУнций:" + result_3);
            }
            else if (valueCategory==1 && valueType==2) {
                result_1 = valueAmount * 16.38;
                result_2 = valueAmount * 36.11;
                result_3 = valueAmount * 577.78;
                System.out.print("Килограммов: " + result_1 +
                        "\nПудов:" + valueAmount +
                        "\nФунтов:" + result_2 +
                        "\nУнций:" + result_3);
            }
            else if (valueCategory==1 && valueType==3) {
                result_1 = valueAmount * 0.4536;
                result_2 = valueAmount / 36.11;
                result_3 = valueAmount * 16;
                System.out.print("Килограммов: " + result_1 +
                        "\nПудов:" + result_2 +
                        "\nФунтов:" + valueAmount +
                        "\nУнций:" + result_3);
            }
            else if (valueCategory==1 && valueType==4) {
                result_1 = valueAmount * 0.02835;
                result_2 = valueAmount / 577.78;
                result_3 = valueAmount / 16;
                System.out.print("Килограммов: " + result_1 +
                        "\nПудов:" + result_2 +
                        "\nФунтов:" + result_3 +
                        "\nУнций:" + valueAmount);
            }
            else if (valueCategory==2 && valueType==1) {
                result_1 = valueAmount / 1852;
                result_2 = valueAmount / 0.91;
                result_3 = valueAmount / 0.3048;
                System.out.print("Метров: " + valueAmount +
                        "\nМиль:" + result_1 +
                        "\nЯрдов:" + result_2 +
                        "\nФутов:" + result_3);
            }
            else if (valueCategory==2 && valueType==2) {
                result_1 = valueAmount * 1852;
                result_2 = valueAmount * 2035.16;
                result_3 = valueAmount * 6076.12;
                System.out.print("Метров: " + result_1 +
                        "\nМиль:" + valueAmount +
                        "\nЯрдов:" + result_2 +
                        "\nФутов:" + result_3);
            }
            else if (valueCategory==2 && valueType==3) {
                result_1 = valueAmount * 0.91;
                result_2 = valueAmount / 2035.16;
                result_3 = valueAmount * 2.9856;
                System.out.print("Метров: " + result_1 +
                        "\nМиль:" + result_2 +
                        "\nЯрдов:" + valueAmount +
                        "\nФутов:" + result_3);
            }
            else if (valueCategory==2 && valueType==4) {
                result_1 = valueAmount * 0.3048;
                result_2 = valueAmount / 6076.12;
                result_3 = valueAmount / 2.9856;
                System.out.print("Метров: " + result_1 +
                        "\nМиль:" + result_2 +
                        "\nЯрдов:" + result_3 +
                        "\nФутов:" + valueAmount);
            }
            else {
                System.out.print("Не предусмотренная величина.");
            }
        }
    }
}
