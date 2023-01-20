package homework5;

public class ArrayUtils {

    public int findLostElement(int[] inputArray) {
        int number;
        for (number = 1; number < inputArray.length + 1; number++) {
            if (!isElementInArray(inputArray, number)) {
                break;
            }
        }
        return number;

    }

    public static boolean isElementInArray(int[] inputArray, int element) {
        boolean result = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (element == inputArray[i]) {
                result = true;
                break;
            }
        }
        return result;
    }


    public int sumCountFinder(int[] inputArray, int inputSum){
        int counter =0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int a = 0; a < inputArray.length; a++) {
                if (inputArray[i]+inputArray[a]==inputSum){
                    counter++;
                }

            }
        }


        return counter/2;
    }

}
