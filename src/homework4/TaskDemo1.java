package homework4;

import java.util.Arrays;

public class TaskDemo1 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------");

     /*
    1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке
     */
        int[] myArray = MyArray.createRandomArray(8, 12, 13);
        System.out.println(Arrays.toString(myArray));

        MyArray.change(myArray, false, 0);
        System.out.println(Arrays.toString(myArray));

        System.out.println("-----------------------------------------");
     /*
    2) Создайте массив из 5 случайных целых чисел из интервала [10;99]
     Выведите его на экран в строку.
     Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
     */
        int [] myArray2 = MyArray.createRandomArray(5,10,99);
        System.out.println(Arrays.toString(myArray2));
        MyArray.printIsGrowArray(myArray2);






    }
}
