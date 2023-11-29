package week04_assignments.yaroslav;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        //TODO Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be replaced by a concatenation of t he respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers should be replaced by CodilityTestCoders
        /*
        Example:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        CodilityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
         */
        printNums(30);

    }
    public static void printNums(int num) {
        for (int i = 1; i <= num; i++) {
           if (i % 30 == 0) {
               System.out.println("CodilityTestCoders");
           } else if (i % 15 == 0) {
               System.out.println("TestCoders");
           }else if (i % 6 == 0) {
               System.out.println("CodilityTest");
           } else if (i % 10 == 0) {
               System.out.println("CodilityCoders");
           } else if (i % 2 == 0) {
               System.out.println("Codility");
           }else if (i % 3 == 0) {
               System.out.println("Test");
           }else if (i % 5 == 0) {
               System.out.println("Coders");
           }else {
               System.out.println(i);
           }
        }
    }
}
