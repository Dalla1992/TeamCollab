package week01_assignments.yaroslav;

public class Finra_Yaroslav {
    public static void main(String[] args) {

        /*
        TODO: Write a method which prints out the numbers from 1 to 30, but for numbers which are a multiple of 3 print "FIN" instead and for the numbers which area multiple of 5 - print "RA" instead of the number. For numbers which are a multiple of both 3 and 5 - print "FINRA" instead of the number
         */

        finra(30);
    }

    public static void finra (int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result = "FINRA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else if (i % 5  == 0) {
                result = "RA";
            } else {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}
