package HomeWork4Converter;

public class KelvinExample1 {




    public KelvinExample1(double c) {

      double tmp2 = sum(c);

        System.out.println(getPrintString() + tmp2);


    }

    public double sum(double c) {

        return c + 273.15;
    }
    public String getPrintString() {

        return getClass().getName() + " = ";
    }

    }

