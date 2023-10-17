package util.week6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));


    }

    public static String removeDuplicates(String str){

        String z = "";
        String [] x = str.split("");
       Set<String> y = new HashSet<>(Arrays.asList(x));
        for (String each : y) {
            z+=each;
        }

        return z;
    }


}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
