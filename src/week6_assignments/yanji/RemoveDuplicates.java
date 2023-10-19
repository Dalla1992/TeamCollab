package week6_assignments.yanji;

public class RemoveDuplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.charAt(i)+"")){
                result += str.charAt(i)+"";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup("APPLEPINEAPPLE"));
    }
}