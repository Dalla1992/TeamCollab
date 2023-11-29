package week03_assignments.yaroslav;

public class SwapTwoIntegers_Yaroslav {
    public static void main(String[] args) {

       //TODO swap given 2 integers without creating third variable. This method will have 2 int params.

       swap(15, 25);
       swap(0, -1);
       swap(0, 0);
    }

    public static void swap(int a, int b) {
        String before = "Before: a = " + a + ", b = " + b;
        b = b + a;
        a = b - a;
        b = b - a;
        String after = "After: a = " + a + ", b = " + b;
        System.out.println(before + "\n" + after);
    }
}
