package src.week2;

public class Finra_Doina {

    public static void finra(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // % 3 and % 5
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
