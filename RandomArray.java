package lesson8dataprocess.task14;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int[] randArray = new int[15];
        int maxInt = 0;
        int minInt = 0;
        int abs;

        for (int i=0; i<15; i++) {
            randArray[i] = randomInt.nextInt(41) - 20;
            // System.out.print(randArray[i] + ", ");
        }
        for (int i=0; i<15; i++) {
            if (maxInt < randArray[i]){
                maxInt = randArray[i];
            }
            if (minInt > randArray[i]){
                minInt = randArray[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + maxInt);
        System.out.println("Минимальный элемент массива: " + minInt);

        abs = Math.max(Math.abs(maxInt), Math.abs(minInt));
        System.out.println("Наибольшая из двух величин по модулю: " + abs);
    }
}
