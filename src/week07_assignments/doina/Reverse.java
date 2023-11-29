package src.week7_assignments.doina;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }
    public static String reverseString(String str) {// this method reverse a String
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {// this loop iterates from the last index of the given str String to reverse the order of the characters

            reverse += str.charAt(i);
        }
        return reverse; //DCBA
    }
}
