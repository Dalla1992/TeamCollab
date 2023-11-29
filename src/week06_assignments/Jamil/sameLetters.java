package week06_assignments.Jamil;

import java.util.Arrays;

public class sameLetters {

    /*
Write a return method that checks if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
    public static void main(String[] args) {
        String a = "bacd";
        String b = "cadb";
        System.out.println(same(a, b));

    }
    public static boolean same(String a, String b){

        char[] A = a.toCharArray(); // {b,a,c,d}
        char[] B = b.toCharArray(); // {c,a,d,b}

        if(a.length()!=b.length()){
            return false;
        }else{
            Arrays.sort(A); //
            Arrays.sort(B); // {a,b,c,d}
        }
        return Arrays.equals(A,B);

    }

}
