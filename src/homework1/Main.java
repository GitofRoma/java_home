package homework1;

public class Main {
    public static void main(String[] args) {





        // task 2
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5F;
        double d = 6.6;
        char c = 'c';
        boolean b1 = false;
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + b1);


        // task 3
        System.out.println();
        int number = 123;
        for (int j = 0; j < 3; j++) {
            System.out.println(number % 10);
            number = number / 10;
        }


    }
}