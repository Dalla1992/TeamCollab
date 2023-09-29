package Week1Assignments.Week1_CodingSolutions_Yaroslav;

public class DividedWithoutOperator {
    public static void main(String[] args) {

        /*
        TODO: Write a method that can divide two numbers without using the division operator
         */

        divide(9, 3);
        divide(100, 2);
        divide(5, 4);
        divide(2, 5);
    }

    public static void divide(int num1, int num2) {
        int counter = 0;
        while (num1 >= num2) {
            num1 -= num2;
            counter++;
        }
        System.out.println(counter);
    }
}
