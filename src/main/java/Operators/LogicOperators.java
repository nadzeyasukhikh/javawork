package Operators;

public class LogicOperators {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;
        int e = 30;
        int r = 40;

        boolean tmp1 = q < w;
        boolean temp2 = e < r;


        // Логический оператор ($$)
        System.out.println("Logic AND examples");

        System.out.println(tmp1 && temp2);

        System.out.println((q < w) && (e < r));

        System.out.println((q > w) && (e < r));

        System.out.println((q > w) && (e > r));

        System.out.println();
        System.out.println("Logic or examples");



        System.out.println((q < w) || (e < r));

        System.out.println((q < w) || (e > r));

        System.out.println((q > w) || (e > r));



        System.out.println();
        System.out.println("Logic NOT examples");

        System.out.println(!((q < w) || (e < r)));

        System.out.println(!((q < w) || (e > r)));

        System.out.println(!((q > w) || (e > r)));

        boolean result10 = (!(((q < r) && (r > w)) || (q < w)) && (e < r)) || !(e > q);
        System.out.println(result10);


    }
}
