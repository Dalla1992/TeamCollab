package week07_assignments.yaroslav;

public class FindUnique {
    public static void main(String[] args) {

        /*
            Find the unique
            Write a return method that can find the unique  characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF"
         */

        System.out.println(findUnique("AAABBBCCCDEF"));     //DEF
        System.out.println(findUnique("apple101"));         //ale0
        System.out.println(findUnique("AVCAVC"));           //
        System.out.println(findUnique(""));                 //Please provide a valid input
        System.out.println(findUnique(null));               //Please provide a valid input

    }

    public static String findUnique(String input) {
        if (input == null || input.isEmpty()) {
            return "Please provide a valid input";
        }

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
                    result = result.concat(String.valueOf(input.charAt(i)));
                }
            }
        }
        return result;
    }
}
