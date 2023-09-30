package week2_assignments.yaroslav;

public class ExtractSum_Yaroslav {
    public static void main(String[] args) {
        //Write a method that will accept a String parameter and return sum of numbers in a string format.
        // Input: "I5 a3m an Soft9ware 2 Develop3er" > output: 5 + 3 + 9 + 2 + 3 = 22


        System.out.println(findSum("I5 a3m an Soft9ware 2 Develop3er"));
        System.out.println(findSum(""));
        System.out.println(findSum(null));
        System.out.println(findSum("Some text"));
    }

    public static String findSum(String text) {
        int sum = 0;
        String result = "";

        if (text == null || text.isEmpty()) {
            return "No numbers are present in the given text";
        }

        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
                result += ch + " + ";
            }
        }

        if (!result.isEmpty()) {
            result = result.substring(0, result.lastIndexOf(" + ")).concat(" = " + sum);
        }

        return result;
    }
}
