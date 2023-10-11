package util.Week03Assignments;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("PrimeNumber(7) = " + PrimeNumber(7));
        System.out.println("PrimeNumber(13) = " + PrimeNumber(13));
        System.out.println("PrimeNumber(26) = " + PrimeNumber(26)); // composite number
        System.out.println("PrimeNumber(85) = " + PrimeNumber(85));


    }

    public static boolean PrimeNumber(int num) {

        if (num % 2 == 0) {
            return false;

        }
        return true;

    }
}
//1. Numbers -- Prime Number
//Write a method that can check if a number is prime or not

/*

A prime number is a number that can only be divided by itself and 1 without remainders.


 What are the prime numbers from 1 to 100? The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
 */