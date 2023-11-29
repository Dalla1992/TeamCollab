package week02_assignments.abdalla;

public class StringSum {

    public static void main(String[] args) {
        sumOfString("I5 a3m an Soft9ware 2 Develop3er");
    }

    public static void sumOfString(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                int n = Integer.parseInt(String.valueOf(ch));
                sum += n;
            }

        }
        System.out.println(sum);
    }
}
 //    Write a method that will accept a String paramater and return sum of numbers in a string format.
 //    Input: "I5 a3m an Soft9ware 2 Develop3er" > output: 5 + 3 + 9 + 2 + 3 = 22