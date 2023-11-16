package src.week8_assignments.doina;

public class SumOfStringDigits {

    public static String sumOfString(String str) {

        String digits = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) { // i=0, iteration, index

            if (Character.isDigit(str.charAt(i))) { // str.charAt(i) each char of the String --> I

                sum += Integer.parseInt(String.valueOf(str.charAt(i)));

                // 5 + 3 + ...
                digits += str.charAt(i) + "+";
            }
        }
        return digits.substring(0, digits.length() - 3) + " = " + sum;
    }

    public static void main(String[] args) {

        String result = "I5 a3m an Soft9ware 2 Develop3er";

        System.out.println("sumOfString(result) = " + sumOfString(result));

    }
}
