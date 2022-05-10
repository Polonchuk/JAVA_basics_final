package lesson8dataprocess.task13;

import java.util.Arrays;
import java.util.Scanner;

public class InLatin {
    public static void main(String[] args) {

        String fullStr;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите строку, содержащую слова, написанные латиницей (не более 10): ");
        fullStr = console.nextLine();
        String[] splitStr = fullStr.split(" ");
        int wordsNum = splitStr.length;
        for (int i = 0; i < wordsNum; i++) {
            String[] latinSet = new String[10];
            int latinNum = 0;
            boolean isLatin = false;
            int wordLength = splitStr[i].length();
            for (int ii = 0; ii < wordLength; ii++) {

                char charToCheck = splitStr[i].charAt(ii);
                if (Character.UnicodeBlock.of(charToCheck).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                    isLatin = true;
                    //System.out.println("Символ " + charToCheck + " - латиница.");
                } else {
                    isLatin = false;
                    break;
                }
            }
            if (isLatin) {
                latinSet[latinNum] = splitStr[i];
                latinNum += 1;

            }
            if (i == wordsNum) {
                System.out.println("Слова латиницей в строке: " + Arrays.toString(latinSet));
                System.out.println("Количество таких слов в строке: " + latinNum);
            }
        }
    }
}