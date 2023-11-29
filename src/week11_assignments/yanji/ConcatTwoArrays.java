package week11_assignments.yanji;

import java.util.Arrays;

public class ConcatTwoArrays {
    
    //1) Array - Concat two arrays
    //Write a return method that can concat two arrays
    
    
    public static String[] concatTwo(String[] arr1, String[] arr2){
        String [] newArr = new String[arr1.length+arr2.length];

        int index = 0;

        for (int i = 0; i < newArr.length; i++) {
            if(i< arr1.length){
                newArr[i]=arr1[i];
            }else{
                newArr[i]=arr2[index];
                index++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {

        String[] arr1 = {"apple","bottom","jeans"};
        String[] arr2 = {"boots","with","the","fur"};

        System.out.println(Arrays.toString(concatTwo(arr1,arr2)));
    }
    
}
