package week04_assignments.yaroslav;

public class DivisibleBy {
    public static void main(String[] args) {
        //TODO Write a program that can print the numbers between 1 - 100 that can be divisible by 3, 5, 10
        // if the numbers can be divisible by 3, 5, 15 then it should be displayed in DivisibleBy15 section
        // if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section
        // if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section
        // EX: Divisible By 15: 15 30 45 60 75 90
        //     Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 95 100
        //     Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

        divisibleBy();

    }
    public static void divisibleBy() {
        String div15 = "Divisible By 15: ";
        String div5 = "Divisible By 5: ";
        String div3 = "Divisible By 3: ";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                div15 += i + " ";
            } else if (i % 5 == 0) {
                div5 += i + " ";
            } else if (i % 3 == 0) {
                div3 += i + " ";
            }
        }
        System.out.println(div15);
        System.out.println(div5);
        System.out.println(div3);
    }
}
