package src.week2;

public class DivisionWithoutOperating_Doina {

    public static void divide(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("CANNOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;             // how many times n2(2) will go into n1(6)?
        String result = n1 + " / " + n2 + " is ";

        while (n1 >= n2) {    // 6, 2 -> 4 -> 2 - > 0
            count++;
            n1 -= n2;
        }

        System.out.println(result + count + " with remainder " + n1);

    }
}
