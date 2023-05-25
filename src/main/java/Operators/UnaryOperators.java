package Operators;

public class UnaryOperators {

    public static void main(String[] args) {
        int q = 8;
//        System.out.println(Integer.toBinaryString(q));
        int q2 = 0b1000;
        int q3 = 0b0111;
        System.out.println(q3);
        System.out.println(~q);

    }
    public static void getExample5() {
        int q = 10;
        System.out.println(q);
        System.out.println(q++);
        System.out.println(q--);
        System.out.println(q);
    }
    public static void getExample4(){
        int q = 10;
        System.out.println(q);
        System.out.println(++q);
        System.out.println(--q);


    }
public static void getExample3() {
        int q = 10;
        System.out.println(q);
        q++;
        System.out.println(q);
        q--;
        System.out.println(q);

    }


    public static void getExample2() {
        int q = 10;
        System.out.println(q);
        ++q;
        System.out.println(q);
        --q;
        System.out.println(q);
    }

    public static void getExample1() {
        int q = 10;
        System.out.println(q);

        q = q + 1;
        System.out.println(q);

        q = q - 1;
        System.out.println(q);
    }
}
