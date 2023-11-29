package src.week9_assignments.doina;

public class Array_FindMin {

    public static void main(String[] args) {

        /*
        Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
         */

        int[] array = {3,2,6,-1,8,9};
        System.out.println(minNum(array));

    }

    public static int minNum(int[] arr){

        int min = arr[0]; // 0 is not a good starting point

        for(int each: arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}
