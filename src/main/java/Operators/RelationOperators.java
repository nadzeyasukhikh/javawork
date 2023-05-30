package Operators;

import java.util.Random;

public class RelationOperators {
    public static void main(String[] args) {

        int q = 10;
        // <

        int temp1 = getRandValue(5, 15);
        System.out.println("q < " + temp1 + " = " + (q < temp1));

        // >

        int temp2 = getRandValue(5, 15);
        System.out.println("q > " + temp2 + " = " + (q > temp2));

//        <=

        int temp3 = getRandValue(5, 15);
        System.out.println("q <=" + temp3 + " = " + (q <= temp3));

        // >=

        int temp4 = getRandValue(5, 15);
        System.out.println("q >=" + temp4 + " = " + (q >= temp4));

        // ==

        int temp5 = getRandValue(5, 15);
        System.out.println("q == " + temp5 + " = " + (q == temp1));

        // !=

        int temp6 = getRandValue(5, 15);
        System.out.println("q != " + temp6 + " = " + (q != temp6));





    }
    public static int getRandValue(int min, int max) {

        Random r = new Random();
       return r.nextInt(min, max + 1);
    }

    public static void example1() {
         int q = 10;
         int w = 20;

        System.out.println("q = " + q + ", w = " + w);

         boolean result1 = q < w;
        System.out.println("q < w = " + result1);

        boolean result2 = q > w;
        System.out.println("q > w = " + result2);


        System.out.println("q <= w = " + (q <= w));
        System.out.println("q >= w = " + (q >= w));

        System.out.println("q == w = " + (q == w));
        System.out.println("q != w = " + (q != w));
    }
}
