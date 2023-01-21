package homework5;

public class Demo {
    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();

        //task 1
        /*
        1. Дан массив размера  N-1  , который должен содержать только целые числа в диапазоне от  1 до N .
        Каждое число представлено в одном экземпляре, кроме одного числа.  Найдите недостающий элемент.
                Пример 1:
        Вход:
        N = 5
        А[] = {1,2,3,5}
        Ответ: 4
        */

        int[] arr = new int[]{1, 2, 4, 5};
        System.out.println(arrayUtils.findLostElement(arr));
        System.out.println(arrayUtils.findLostElement2(arr));
        System.out.println(arrayUtils.findLostElement3(arr));
        System.out.println(arrayUtils.findLostElement4(arr));


        //task 2
        /*
        Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
Пример 1:
Вход:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Вывод: 2 пары чисел
Объяснение:
arr[0] + arr[1] = 1 + 5 = 6
arr[1] + arr[3] = 5 + 1 = 6.
         */

        int[] arr2 = new int[]{1, 5, 7, 1};
        int sum = 6;
        System.out.println(arrayUtils.sumCountFinder(arr2, sum));


        //task3
        /*
        Дано два числа, например 3 и 56, значение которых хранятся в переменных.
a)Необходимо составить следующие текстовые строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используйте метод StringBuilder.append().
b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
c)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
         */
        int a = 3;
        int b = 56;

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();

        //a
        str1 = str1.append(a).append(" + ").append(b).append(" = ").append(a + b);
        str2 = str2.append(a).append(" - ").append(b).append(" = ").append(a - b);
        str3 = str3.append(a).append(" * ").append(b).append(" = ").append(a * b);

        //b
        MyStringBuilder.myReplace(str1, "=", "равно");
        MyStringBuilder.myReplace(str2, "=", "равно");
        MyStringBuilder.myReplace(str3, "=", "равно");

        //c
        str1.replace(7, 8, "равно");
        str2.replace(7, 8, "равно");
        str2.replace(7, 8, "равно");


    }
}
