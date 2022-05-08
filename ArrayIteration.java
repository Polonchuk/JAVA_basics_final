package lesson7cycles.task7;

import java.util.Scanner;

public class ArrayIteration {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int arrayRange = 1;
        int[] constants = new int[] {1, 3, 7};

        System.out.print("Введите количество элементов массива: ");
        arrayRange = console.nextInt();

        int[] userArray = new int[arrayRange];

        for (int i = 1; i <= arrayRange; i++) {
            System.out.print("Введите " + i + " элемент массива (целое число): ");
            userArray[i-1] = console.nextInt();
            for (int ii = 0; ii < constants.length; ii++) {
                if (userArray[i-1] == constants[ii]){
                    System.out.print("Элемент \"" + userArray[i-1] + "\" имеется в константах." + "\n");
                }
            }
        }


    }
}
