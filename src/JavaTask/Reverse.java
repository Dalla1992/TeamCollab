package JavaTask;

public class Reverse {

    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static void main(String[] args) {

        String str = "apple";

        System.out.println("reverse(str) = " + reverse(str));
    }
}
