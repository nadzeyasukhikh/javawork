package SigmoidExamples;

public class SigmoidInit {
    public static void main(String[] args) {
//        S(x) = 1 / (1 + e^(-x))

        double x = -0.5;
        double result0 = 1 / (1 + Math.pow(Math.E, (x * (-1))));
        System.out.println("Classic way = " + result0);

        SigmoidOne s1 = new SigmoidOne(x);



    }
}
