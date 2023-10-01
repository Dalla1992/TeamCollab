package week3_assignments.abdalla;

public class StringSwap {

    public static void main(String[] args) {
        stringSwap("hi","bye");
    }

    public static void stringSwap(String a,String b){
        a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
