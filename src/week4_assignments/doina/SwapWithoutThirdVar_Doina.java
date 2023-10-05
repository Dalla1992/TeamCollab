package src.week4_assignments.doina;

public class SwapWithoutThirdVar_Doina {
     /*
    // Swap given 2 integers without creating third variable. This method will have 2 int params, return type void
     */

    public static void swap(int num1, int num2){ // using addition and subtraction

        num1 = num1 + num2; // 15
        num2 = num1 - num2; // 15 - 10 = 5
        num1 = num1 - num2; // 15 - 5 = 10

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
