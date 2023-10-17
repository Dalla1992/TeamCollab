package week6_assignments.darya;

import java.util.Arrays;

public class SameLetters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean same(String str1, String str2){

        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();

        if (str1.length()!=str2.length()){
            return false;
        }else{
            Arrays.sort(st1);
            Arrays.sort(st2);
        }
        return Arrays.equals(st1, st2);
    }

    public static void main(String[] args) {



    }



}
