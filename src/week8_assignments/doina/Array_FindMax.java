package src.week8_assignments.doina;

public class Array_FindMax {


    public static int maxNum(int[] arr) {
        int max = arr[0];  // I use the first element

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 9, -3, 7, 2};

        System.out.println(maxNum(arr));

    }
}
