package week6_assignments.yanji;

import java.util.Arrays;

public class SameLetters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean sameLetter(String str1, String str2){

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "acb"));
        System.out.println(sameLetter("abc", "abb"));
    }
}
