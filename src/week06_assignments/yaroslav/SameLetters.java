package week06_assignments.yaroslav;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        //TODO write a method that checks if a string is built out of the same letters as another string
        //Ex: same("abc", "cab") ==> true
        //Ex: same ("abc", "abb") ==> false


        System.out.println(sameLetters("abc", "cab"));          // true
        System.out.println(sameLetters("abc", "abb"));          // false
        System.out.println(sameLetters("elbow", "below"));      // true
        System.out.println(sameLetters("", null));              // false
    }

    public static boolean sameLetters(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
