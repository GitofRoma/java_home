package homewprk4;

import java.util.Random;

public class MyArray {

    public static int[] createRandomArray(int size, int from_value, int to_value) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = from_value + random.nextInt(to_value + 1 - from_value);
        }
        return array;
    }

    public static void change(int[] array, boolean isEvenChange, int ChangeTo) {

        for (int i = 0; i < array.length; i++) {
            if (isEvenChange && i % 2 == 0) {
                array[i] = ChangeTo;
            }
            if (!isEvenChange && i % 2 > 0) {
                array[i] = ChangeTo;
            }
        }
    }

    public static void printIsGrowArray(int[] array) {
        boolean isGrow = true;
        int tmpValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > tmpValue) {
                tmpValue = array[i];
            } else {
                isGrow = false;
            }
        }

        if (isGrow) {
            System.out.println("Это массив строго возрастающеся последовательности");
        } else {
            System.out.println("Это массив не строго возрастающеся последовательности");
        }

    }


}
