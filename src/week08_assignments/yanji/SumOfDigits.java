package week08_assignments.yanji;

public class SumOfDigits {

    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {
        System.out.println(sumOfDigits("Apple5500"));
    }


    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum += str.charAt(i) - 48;
            }
        }
        return sum;
    }
}
