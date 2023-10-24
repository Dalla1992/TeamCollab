package week7_assignments.darya;

public class FindUnique {

    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String uniqueChar(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println("uniqueChar(\"AAABBBCCCDEF\") = " + uniqueChar("AAABBBCCCDEF"));
    }

}
