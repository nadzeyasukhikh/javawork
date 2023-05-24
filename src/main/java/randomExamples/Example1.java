package randomExamples;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {

        // обозначения диапазонов
        // сгенерировать целые значения от 0 до 10:
        // (0;10) -> 1,2,3,4,5,6,7,8,9
        // [0;10) -> 0,1,2,3,4,5,6,7,8,9
        // [0;10] -> 0,1,2,3,4,5,6,7,8,9,10
        // (0;10] -> 1,2,3,4,5,6,7,8,9,10

        Random r = new Random(123);


       boolean q =  r.nextBoolean();

      int w = r.nextInt();

      int e =  r.nextInt(10); //[0;10)

      int t = r.nextInt(20,25); //[20;25)

        // дробные числа

        double y = r.nextDouble();

        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(t);
        System.out.println(y);

    }
}
