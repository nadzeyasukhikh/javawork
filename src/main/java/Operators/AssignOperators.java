package Operators;

public class AssignOperators {
    public static void main(String[] args) {
        int q = 10;

//        q++;

        q += 1000;
        System.out.println(q);

        q -= 10;
        System.out.println(q);

        q *= 5;
        System.out.println(q);

        q /= 20;
        System.out.println(q);
        q %= 3;
        System.out.println(q);
    }
}
