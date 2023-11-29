package week06_assignments.yaroslav;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //TODO write a method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDupes("AAABBBCCC"));
        System.out.println(removeDup("banana"));
        System.out.println(removeDupes("banana"));

    }
    public static String removeDup(String str) {
        Set<String> noDupes = new LinkedHashSet<>(Arrays.asList(str.split("")));
        return String.join("", noDupes);
    }

    public static String removeDupes(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.contains(String.valueOf(ch))) {
                continue;
            }
            result += ch;
        }
        return result;
    }
}
