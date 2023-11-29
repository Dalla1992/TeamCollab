package week03_assignments.abdalla;

public class NumsSwap {
    public static void main(String[] args) {
        numSwap(3,4);
    }


    public static void numSwap(int x, int y ){
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
