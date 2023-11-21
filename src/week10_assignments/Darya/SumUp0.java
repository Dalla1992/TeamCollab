package week10_assignments.Darya;

import java.util.Arrays;

public class SumUp0 {

    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */

    public static int[] sumUpToZero (int n) {

        int[] arr = new int[n]; // n=4
        int index = 0;
        int startPoint = -(n/2); //-2
        int endPoint = -startPoint; // 2


        if( n > 1 && n < 100){

            for (int i = startPoint; i <= endPoint; i++){

                if (n%2==0){

                    if (i==0){
                        continue;
                    }else{
                        arr[index] = i; //arr[index++] = i;
                        index++;
                    }
                }else{
                    arr[index] = i; //arr[index++] = i;
                    index++;
                }
            }

        }else{
            System.err.println("Invalid number");
        }
        return arr;
    }

    public static void main(String[] args) {
      //  System.out.println("sumUpToZero: " + Arrays.toString(sumUpToZero(8)));

        System.out.println("Arrays.toString(returnZeroArrayWithLengthOfN) = " + Arrays.toString(returnZeroArrayWithLengthOfN(4)));
    }


    public static int[] returnZeroArrayWithLengthOfN(int N){ // N = 6;

        int [] output = new int[N];
        int a = 0;
        int x = 1;
        int y = -(N/2); // if N = 6 -->  y = -(6/2) --> y = -3
        if (N%2==0){ // if N is even, this will run   -----> 20
            for (int j=0; j<N/2; j++){
                output[j]= y;
                y++;
                if (j == (N/2)-1){ // j = last index of the loop --> j = 2;
                    a=j+1;         // a = 2+1 --> a = 3;
                }
            }
            for (int i=a; i<N; i++){
                output[i]= x;// [1,2,-1,-2]
                x++;
            }
        }
        else { // if N is odd, this will run   ----> 21     [-----2-1,0,+1+2++++]
            for (int j=0; j<N/2; j++){
                output[j]= y;
                y++;
                if (j == (N/2)-1){
                    a=j+1;
                }
            }
            output[a]=0;
            for (int i=a+1; i<N; i++){
                output[i]= x;
                x++;
            }
        }
        return output;
    }

}
