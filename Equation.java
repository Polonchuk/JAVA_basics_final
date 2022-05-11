package lesson9final.task2;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {

        int xposition=0;
        int firstInt=0;
        int secondInt=0;
        int thirdInt=0;
        int result;

        Scanner console = new Scanner(System.in);
        System.out.print("Введите уравнение в виде строки из пяти символов формата\n <число или х>< + или - ><число или х><=><число или х>: ");
        String someStr = console.nextLine();

        char firstChar = someStr.charAt(0);
        if (Character.isDigit(firstChar)){
            firstInt = Integer.parseInt(String.valueOf(firstChar));
            }
        else if (Character.isLetter(firstChar)) {
            xposition = 1;
        }
        else {
            System.out.print("Некорректный ввод первого символа.");
            return;
        }

        char thirdChar = someStr.charAt(2);
        if (Character.isDigit(thirdChar)){
            secondInt = Integer.parseInt(String.valueOf(thirdChar));
        }
        else if (Character.isLetter(thirdChar)) {
            xposition = 2;
        }
        else {
            System.out.print("Некорректный ввод третьего символа.");
            return;
        }

        char fifthChar = someStr.charAt(4);
        if (Character.isDigit(fifthChar)){
            thirdInt = Integer.parseInt(String.valueOf(fifthChar));
        }
        else if (Character.isLetter(fifthChar)) {
            xposition = 3;
        }
        else {
            System.out.print("Некорректный ввод пятого символа.");
            return;
        }

        char secondChar = someStr.charAt(1);
        switch (xposition) {
            case 1:
                if (String.valueOf(secondChar).equals("+")) {
                    result = thirdInt - secondInt;
                    System.out.print("х = " + result);
                }
                else if (String.valueOf(secondChar).equals("-")) {
                    result = thirdInt + secondInt;
                    System.out.print("х = " + result);
                }
                else {
                    System.out.print("Некорректный ввод +/-.");
                    return;
                }
                break;
            case 2:
                if (String.valueOf(secondChar).equals("+")) {
                    result = thirdInt - firstInt;
                    System.out.print("х = " + result);
                }
                else if (String.valueOf(secondChar).equals("-")) {
                    result =  firstInt - thirdInt;
                    System.out.print("х = " + result);
                }
                else {
                    System.out.print("Некорректный ввод +/-.");
                    return;
                }
                break;
            case 3:
                if (String.valueOf(secondChar).equals("+")) {
                    result = firstInt + secondInt;
                    System.out.print("х = " + result);
                }
                else if (String.valueOf(secondChar).equals("-")) {
                    result =  firstInt - secondInt;
                    System.out.print("х = " + result);
                }
                else {
                    System.out.print("Некорректный ввод +/-.");
                    return;
                }
                break;
            default:
                System.out.print("Что-то не то с иксом...");
        }
    }
}