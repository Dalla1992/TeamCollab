package JavaTask;

public class Unique {

    public static String unique(String input) {  // ABAC = //"BC"

        String unique = "";
        for (int i = 0; i < input.length(); i++) {
            if (unique.contains(input.charAt(i) + "")) {
                unique = unique.replace(input.charAt(i) + "", "");
            } else {
                unique += input.charAt(i);
            }
        }
        return unique;

    }


    public static void main(String[] args) {

        String str1 = "ABAC";

        System.out.println("unique(str1) = " + unique(str1));

    }
}
