package week08_assignments.yaroslav;

public class SumOfDigits {
    public static void main(String[] args) {

        //Write a method that can return the sum of the digits in a string

        System.out.println(sumOfDigits("Word12ISlo33done"));     //9
        System.out.println(sumOfDigits("134some1text03"));      //12
        System.out.println(sumOfDigits("apple"));               //0
    }

    public static int sumOfDigits(String input) {
        int sum = 0;
        for (char eachChar : input.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                sum += Character.getNumericValue(eachChar);
            }
        }
        return sum;
    }
}
