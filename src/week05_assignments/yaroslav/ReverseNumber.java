package week05_assignments.yaroslav;

public class ReverseNumber {
    public static void main(String[] args) {

        //TODO Write a method that can reverse negative number and return it as int

        System.out.println(reverseNum(-12345));                 // -54321
        System.out.println(reverseAndPositive(-12345));    // 54321
    }

    public static int reverseNum(int num) {
        if (num >= 0) {
            System.out.println("Please provide a negative number");
            return 0;
        }
        int result = 0;
        while (num < 0) {
            result = result * 10 + (num % 10);
            num = num / 10;
        }
        return result;
    }

    public static int reverseAndPositive(int num) {
        if (num >= 0) {
            System.out.println("Please provide a negative number");
            return 0;
        }
        int result = 0;
        while (num < 0) {
            result = result * 10 + ((num % 10) - (num % 10) * 2);
            num = num / 10;
        }
        return result;
    }
}
