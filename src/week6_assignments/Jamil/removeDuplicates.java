package week6_assignments.Jamil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

    /*
        String -- Remove Duplicates
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
         */
    public static void main(String[] args) {
        //System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCCC"));
    }

    public static String removeDup(String str){
        String z = "";
        String [] x = str.split("");
        Set<String> y = new HashSet<>(Arrays.asList(x));
        for (String each : y){
            z += each;
        }
        return z;
    }
    public static String removeDup2(String str){
        String z = "";
        for (int i = 0; i < str.length(); i++) {
            if(!z.contains("" + str.charAt(i))){
                z += "" + str.charAt(i);
            }
        }
        return z;
    }

}
