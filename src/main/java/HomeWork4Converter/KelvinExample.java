package HomeWork4Converter;

public class KelvinExample {

    private double result;
    private final double C;

    public KelvinExample(double c) {
        C = c;
        sum();
        printResult();
    }

    private void sum() {
      result = C + 273.15;
    }
    public void printResult() {
        System.out.println(getClass().getName() + " = " + result);
    }
}
