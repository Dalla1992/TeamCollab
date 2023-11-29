package src.week4_assignments.doina;

public class ConsecutiveNumbers_Doina {

    public static void consecutiveNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }

            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);// if the result is not divisible by 3 || 5 || 15, then print the number itself
        }
    }
}
