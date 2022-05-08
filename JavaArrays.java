package lesson3arrays.task1;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[] {3, 14, 15, 92, 65};

        System.out.println(Arrays.toString(arrayOne));

        int last = arrayOne[arrayOne.length - 1];

        arrayOne[arrayOne.length - 1] = arrayOne[0];
        arrayOne[0] = last;

        System.out.println(Arrays.toString(arrayOne));

        int elemSum = arrayOne[0] + arrayOne[arrayOne.length/2];

        System.out.println(elemSum);
    }
}
