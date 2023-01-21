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

    public int findLostElement2(int[] inputArray) {    //{1,2,3,5}
        int realSum = 0;
        int idealSum = 0;
        for (int num : inputArray) {
            realSum += num;
        }
        for (int i = 0; i <= inputArray.length + 1; i++) {
            idealSum += i;
        }
        return idealSum - realSum;
    }

    public int findLostElement3(int[] inputArray) {    //{1,2,3,5}
        int result = 1;
        int resultTmp = 1;
//        boolean isIn=true;

        while (result == resultTmp) {
            for (int i = 0; i < inputArray.length; i++) {
                if (result == inputArray[i]) {
                    resultTmp++;
                }
            }

            if (result != resultTmp) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    public int findLostElement4(int[] inputArray) {    //{1,2,3,5}
        int result = 1;
        boolean isGo = true;

        while (isGo) {
            isGo = false;
            for (int i = 0; i < inputArray.length ; i++) {
                if (result == inputArray[i]) {
                    isGo = true;
                    result++;
                }
            }
        }
        return result;
    }


    public int sumCountFinder(int[] inputArray, int inputSum) {
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int a = 0; a < inputArray.length; a++) {
                if (inputArray[i] + inputArray[a] == inputSum) {
                    counter++;
                }
            }
        }
        return counter / 2;
    }

}
