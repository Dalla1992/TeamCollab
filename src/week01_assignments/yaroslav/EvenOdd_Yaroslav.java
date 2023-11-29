package week01_assignments.yaroslav;

public class EvenOdd_Yaroslav {
    public static void main(String[] args) {

        /*
        TODO: Write a method which can identify given number is even or odd.

         Ex: identify(5) -> "Odd"
             identify(6) -> "Even"
         */

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(0));
        System.out.println(identify(-10));

    }

    public static String identify (int num) {
        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
