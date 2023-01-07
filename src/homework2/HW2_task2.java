package homework2;

public class HW2_task2 {
    public static void main(String[] args) {
//Задание №2.
        System.out.println("------------Задание №2------------");
        String str = new String("I study Basic Java");
        metod1(str);
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(14, str.length()));
    }

    public static void metod1(String str) {
    }

}