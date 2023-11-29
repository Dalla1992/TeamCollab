package week04_assignments.yaroslav;

public class SwapNumbers {
    public static void main(String[] args) {
        //TODO swap two variable values without using a third variable
        swap(115, 120);
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
