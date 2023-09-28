package oddOrEven;

public class Divide {


    public static void main(String[] args) {

        divideWithoutDivision(12,2);

    }

    public static void divideWithoutDivision(int x, int y){
        int count = 0;
        while (x >= y) {
            x -= y;
            count++;
        }
        System.out.println(count + " remainder " + x % y);
    }






}