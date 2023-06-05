package switchExamples;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls a value for A: ");
        int a = sc.nextInt();

        System.out.println("Enter pls a value for B: ");
        int b = sc.nextInt();

        sc.close();

        System.out.println("A = " +a + ", B = " + b );


        String result = (a > b) ? "A > B" : (a < b) ? "D > A" : "A == B";
        System.out.println(result);


//        if (a > b) System.out.println("A > B");
//        else System.out.println("B > A");

    }
}
