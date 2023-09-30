package week1_assignments.abdalla;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to check if it's Odd or Even:");

        int n = input.nextInt();


        if (n % 2 == 0){
            System.out.println("identify(" + n + ")  -> Even");
        }else if(n % 2 != 0){
            System.out.println("identify(" + n + ")  -> Odd");

        }
    }
}
