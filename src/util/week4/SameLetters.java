package util.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        String a = "abc";
        String b = "cab";

        System.out.println(same(a, b));


    }
    public static boolean same(String a, String b){

        char[] A = a.toCharArray(); //{a,c,d,b}
        char[] B = b.toCharArray(); //{a,d,c,b}

        if (a.length()!=b.length()) {
            return false;
        }else {
            Arrays.sort(A); // {a,b,c,d} sort in a - to z
            Arrays.sort(B); // {c,a,d,b}

        }

        return Arrays.equals(A,B);
    }

}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */