package cycles;

public class Example1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("hello java " + i);

        }
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("hello java " + i);
        }
        System.out.println(i);

        for (int j = 0; j < 100; j =  j + 2) {
            System.out.println(j + " ");
        }


        System.out.println();


        for (int j = 0; j < 100; j++) {
            if (j % 2 == 0)
                System.out.println(j + " ");

        }





    }

    public  static void getExample1() {

        for (int i = 0; i < 3; i++) {

            System.out.println("hello java " + i);
        }
        for (int i = 2; i >= 0; i--) {

            System.out.println("hello java " + i);
        }
    }
}
