package lesson9final.task3;

import java.util.Scanner;

public class DiverseString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Scanner console2 = new Scanner(System.in);
        int strNumber = 1;
        System.out.print("Введите количество строк: ");
        strNumber = console.nextInt();

        int[] stringsDiv = new int[strNumber];
        String[] stringsList = new String[strNumber];
        boolean strEqual;
        boolean isEqual;

        for (int i = 0; i < strNumber; i++) {
            int thisStringDiv = 1;
            System.out.print("Введите строку " + (i + 1) + ": ");
            stringsList[i] = console2.nextLine();
            int strLength = stringsList[i].length();
            String[] strArr = stringsList[i].split("");
            if (strLength > 1) {
                for (int ii = 1; ii < strLength; ii++) {
                    strEqual = false;
                    for (int iii = ii - 1; iii >= 0; iii--) {
                        isEqual = strArr[iii].equals(strArr[ii]);
//                        System.out.println("\nсимвол: " + strArr[iii] + " и символ " + strArr[ii] + " равны : " + isEqual);
                        if (isEqual == true) {
                            strEqual = true;
                        }
                    }
                    if (strEqual != true) {
                        thisStringDiv += 1;
                    }
                }
            }
            stringsDiv[i] = thisStringDiv;
//            System.out.println("\nСтрока: " + stringsList[i] + " вариативность: " + stringsDiv[i]);
        }
        int maxDiv = 1;
        int maxDivStrNum = 0;
        for (int i = 0; i < strNumber; i++) {
            if (stringsDiv[i] > maxDiv){
                maxDiv = stringsDiv[i];
                maxDivStrNum = i;
            }

        }
        System.out.println("\nСтрока c максимальной вариативностью символов: " + stringsList[maxDivStrNum] + " (вариативность: " + stringsDiv[maxDivStrNum] + ")");
    }
}