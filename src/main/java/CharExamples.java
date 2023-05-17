public class CharExamples {
    public static void main(String[] args) {
        char q = 't';
        char w = 169;
        char e = '\u00AE';


        System.out.println((int) q);

        System.out.println((char) (q + w));
        System.out.println(q - w);
        System.out.println(q / w);
        System.out.println(q * w);
        System.out.println(q % w);

        System.out.println();


        // char -> int
        // 1. ASCII
        char r = 'ܮ';
        int rInt = (int) r;
        System.out.println(rInt);

        char t = '9';
//       String preResult =  String.valueOf(t);
//        int result = Integer.parseInt(preResult);

        int result = Integer.parseInt(String.valueOf(t));

        System.out.println(result + 1);


        char y = '8';

        double result3 = Character.getNumericValue(y);
        System.out.println(result3 + 2);
    }
}
