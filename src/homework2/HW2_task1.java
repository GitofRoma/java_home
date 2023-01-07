package homework2;

import java.util.Scanner;

public class HW2_task1 {
    public static void main(String[] args) {
        //Задание №1.
        //0. Перевести число 333 из шестнадцатиричной в десятичную
        System.out.println("------------Задание №1------------");
        System.out.println("---------0------------");
        String numberStr = "333";
        System.out.println("В десятичной системе это :" + from_16_to_10(numberStr));

        //1.Разложить число 200345 на разряды в десятичной системе
        // 200,345
        //не понял задание наверно

        //2.Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10)
        System.out.println("---------2------------");
        int number3 = 637;
        System.out.println(from_10_to_16(number3));
        System.out.println(from_16_to_10(from_10_to_16(number3)));

        //3.Перевести 637 из десятичной в двоичную
        System.out.println("---------3------------");
        int number4 = 124;
        System.out.println(from_10_to_2(number4));

        //4.11100111 перевести в десятичную
        System.out.println("---------4------------");
        String number5 = "11100111";
        System.out.println(from_2_to_10(number5));

        //5.Перевести 637 из десятичной в троичную
        System.out.println("---------5------------");
        int number6 = 637;
        System.out.println(from_10_to_3(number6));

    }

    public static int from_16_to_10(String number) {
        int lengthNumberStr = number.length();
        char tmpChar;
        int tmpInt = 0;
        int result = 0;

        for (int i = lengthNumberStr - 1; i >= 0; i--) {
            tmpChar = number.charAt(i);

            if (tmpChar == '0') {
                tmpInt = 0;
            } else if (tmpChar == '1') {
                tmpInt = 1;
            } else if (tmpChar == '2') {
                tmpInt = 2;
            } else if (tmpChar == '3') {
                tmpInt = 3;
            } else if (tmpChar == '4') {
                tmpInt = 4;
            } else if (tmpChar == '5') {
                tmpInt = 5;
            } else if (tmpChar == '6') {
                tmpInt = 6;
            } else if (tmpChar == '7') {
                tmpInt = 7;
            } else if (tmpChar == '8') {
                tmpInt = 8;
            } else if (tmpChar == '9') {
                tmpInt = 9;
            } else if (tmpChar == 'A') {
                tmpInt = 10;
            } else if (tmpChar == 'B') {
                tmpInt = 11;
            } else if (tmpChar == 'C') {
                tmpInt = 12;
            } else if (tmpChar == 'D') {
                tmpInt = 13;
            } else if (tmpChar == 'E') {
                tmpInt = 14;
            } else if (tmpChar == 'F') {
                tmpInt = 15;
            } else {
                System.out.println("Нет числа " + number + " в шестнадцатиричной системе исчисления");
                break;
            }

            result += Math.pow(16, lengthNumberStr - 1 - i) * tmpInt;
        }
        return result;
    }

    public static String from_10_to_16(int number) {
        int tmpResultInt;
        String result = "";
        String tmpResult = "";

        while (number > 0) {
            tmpResultInt = number % 16;
            number = number / 16;

            if (tmpResultInt == 0) {
                tmpResult = "0";
            } else if (tmpResultInt == 1) {
                tmpResult = "1";
            } else if (tmpResultInt == 2) {
                tmpResult = "2";
            } else if (tmpResultInt == 3) {
                tmpResult = "3";
            } else if (tmpResultInt == 4) {
                tmpResult = "4";
            } else if (tmpResultInt == 5) {
                tmpResult = "5";
            } else if (tmpResultInt == 6) {
                tmpResult = "6";
            } else if (tmpResultInt == 7) {
                tmpResult = "7";
            } else if (tmpResultInt == 8) {
                tmpResult = "8";
            } else if (tmpResultInt == 9) {
                tmpResult = "9";
            } else if (tmpResultInt == 10) {
                tmpResult = "A";
            } else if (tmpResultInt == 11) {
                tmpResult = "B";
            } else if (tmpResultInt == 12) {
                tmpResult = "C";
            } else if (tmpResultInt == 13) {
                tmpResult = "D";
            } else if (tmpResultInt == 14) {
                tmpResult = "E";
            } else if (tmpResultInt == 15) {
                tmpResult = "F";
            }
            result = tmpResult + result;
        }
        return result;
    }

    public static String from_10_to_2(int number) {
        int tmpResultInt;
        String result = "";
        String tmpResultString = "";

        while (number > 0) {
            tmpResultInt = number % 2;
            if (tmpResultInt == 0) {
                tmpResultString = "0";
            } else {
                tmpResultString = "1";
            }
            result = tmpResultString + result;
            number = number / 2;
        }
        return result;
    }

    public static int from_2_to_10(String number) {
        int lengthNumberStr = number.length();
        int result = 0;
        String tmpChar;

        for (int i = 0; i <= lengthNumberStr - 1; i++) {
            tmpChar = String.valueOf(number.charAt(i));
            result += Integer.parseInt(tmpChar) * Math.pow(2, lengthNumberStr - 1 - i);
        }

        return result;
    }

    public static String from_10_to_3(int number) {
        int tmpResultInt;
        String result = "";
        String tmpResultString = "";

        while (number > 0) {
            tmpResultInt = number % 3;
            if (tmpResultInt == 0) {
                tmpResultString = "0";
            } else if (tmpResultInt == 1) {
                tmpResultString = "1";
            } else {
                tmpResultString = "2";
            }
            result = tmpResultString + result;
            number = number / 3;
        }
        return result;
    }

}


