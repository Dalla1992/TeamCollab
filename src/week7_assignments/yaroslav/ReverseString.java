package week7_assignments.yaroslav;

public class ReverseString {
    public static void main(String[] args) {

        /*
                Write a return method that can reverse String
                EX: Reverse("ABCD") ==> "DCBA"
         */

        System.out.println(reverse("ABCD"));     //ABCD ==> DCBA
        System.out.println(reverse("apple"));    //apple ==> elppa
        System.out.println(reverse(""));         //Please provide a valid input
        System.out.println(reverse("1122"));    //1122 ==> 2211
        System.out.println("-------------------------");
        System.out.println(reverseOptionTwo("ABCD"));     //ABCD ==> DCBA
        System.out.println(reverseOptionTwo("apple"));    //apple ==> elppa
        System.out.println(reverseOptionTwo(""));         //Please provide a valid input
        System.out.println(reverseOptionTwo("1122"));    //1122 ==> 2211

    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return "Please provide a valid input";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return input + " ==> " + sb;
    }

    public static String reverseOptionTwo(String input) {
        if (input == null || input.isEmpty()) {
            return "Please provide a valid input";
        }

        StringBuilder sb = new StringBuilder(input);
        return input + " ==> " + sb.reverse();
    }
}
