package SigmoidExamples;

public class SigmoidTwo {

    private double result1, result2, result3,result4;

    private final   double X;

    public SigmoidTwo(double x) {
        X = x;

        neg();
        pow();
        sum();
        div();
        System.out.println(result4);
    }

    public double neg() {
        result1 = X * (-1);
        return result1;
    }
    public double pow() {
        result2 = Math.pow(Math.E, result1);
        return result2;
    }
    public double sum() {
        result3 = 1 + result2;
        return result3;
    }

    public double div() {
        result4 = 1 / result3;
        return result4;
    }
}
