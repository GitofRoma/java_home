package homework2;

import java.util.Scanner;

public class HW2_task3 {
    public static void main(String[] args) {
        ///Задание №3.
        //--------------------------------------------------------------------------------------
        System.out.println("------------Задание №3------------");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String str1 = null;
        String str2 = null;

        while (flag) {
            System.out.println("введите первое слово,  состоящее из четного количества букв... ");
            str1 = scanner.nextLine();
            if (str1.length() % 2 != 0) {
                System.out.println("надо слово, состоящее из четного кол-ва букв. Еще раз...");
                str1 = scanner.nextLine();
            }
            System.out.println("введите второе слово,  состоящее из четного количества букв... ");
            str2 = scanner.nextLine();
            if (str2.length() % 2 != 0) {
                System.out.println("надо слово, состоящее из четного кол-ва букв. Еще раз...");
                str2 = scanner.nextLine();
            }
            flag = false;
        }
        String resultSum = str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2, str2.length());
        System.out.println(resultSum);
        System.out.println("---------------------");


        //--------------------------------------------------------------------------------------
        int a = 5;
        int b = 6;
        System.out.println(sum(a, b));
        System.out.println(minus(a, b));
        System.out.println(mult(a, b));
        System.out.println(division(a, b));
        System.out.println("---------------------");

        //--------------------------------------------------------------------------------------
        System.out.println(convertToDollars(100, 0.98));
        System.out.println("---------------------");

        //--------------------------------------------------------------------------------------
        int diameter1 = 24;
        int diameter2 = 48;
        int CalloryPerSm = 40;
        double square1 = Math.PI * Math.pow((diameter1 / 2), 2);
        double square2 = Math.PI * Math.pow((diameter2 / 2), 2);
        double difCallorys = (square2 - square1) * CalloryPerSm;
        System.out.println(difCallorys);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double convertToDollars(double euro, double course) {
        return euro / course;
    }


}


