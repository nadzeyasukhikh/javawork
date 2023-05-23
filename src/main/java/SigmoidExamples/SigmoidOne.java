package SigmoidExamples;

public class SigmoidOne {


        //        S(x) = 1 / (1 + e^(-x))

//         neg() pow() sum() div()
   private double result1, result2, result3, result4, x;

   private final double X;

   public SigmoidOne(double x) {
       X = x;

       neg();
       pow();
       sum();
       div();
      printResult();
   }
  private void neg() {
  result1 = X * (-1);
  }

   private void pow() {
    result2 = Math.pow(Math.E, result1);
  }
      private void sum() {
        result3 = 1 + result2;
      }
      private void div() {
     result4 = 1 / result3;


      }

    public void printResult() {
        System.out.println(getClass().getName() + " = " + result4);
    }

}
