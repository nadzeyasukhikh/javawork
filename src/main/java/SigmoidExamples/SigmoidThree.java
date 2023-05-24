package SigmoidExamples;

public class SigmoidThree {


   private double tmp4;

    public SigmoidThree(double x) {


//       double tmp1 =  neg(x);
//       double tmp2 =  pow(tmp1);
//      double tmp3 =  sum(tmp2);
//         double tmp4 = div(tmp3);

      tmp4 = div(sum(pow(neg(x)))) ;

        printResult();
    }

    private double neg(double x) {

        return x * (-1);
    }
    private double pow(double q) {
        return Math.pow(Math.E, q);

    }
    private double sum(double w) {
         return  1 + w;

    }

    private double div(double e) {
        return   1 / e;

    }
    private String getPrintString() {

        return getClass().getName() + " = ";
    }
    public  void printResult() {
        System.out.println(getPrintString() + tmp4);
    }
}

