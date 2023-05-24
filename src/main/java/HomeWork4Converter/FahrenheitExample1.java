package HomeWork4Converter;

public class FahrenheitExample1 {




    public FahrenheitExample1(double c) {

        double tmp = neg(c);
       double tmp1 = sum(tmp);

        System.out.println(getPrintString() + tmp1);
    }

    public double neg(double c) {


        return c * 9/5;
    }
    public double sum(double q) {

        return q + 32;
    }
    public String getPrintString() {

        return getClass().getName() + " = ";
    }
}
