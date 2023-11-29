package week05_assignments.yaroslav;

public class PrimeNumber {
    public static void main(String[] args) {

        //TODO write a method that can check if a number is prime or not

        for (int i = 1; i < 98; i++) {
            prime(i);
        }

    }

    public static void prime(int num) {
       String result = "";
       for (int i = 2; i < num; i++) {
           if (num % i == 0) {
               result = num + " is not";
               break;
           }
       }
       if (result.isEmpty()) {
           result = num + " is PRIME";
       }
        System.out.println(result);
    }
}
