package HomeWork4Converter;

public class FahrenheitExample {
    private double result1, result2;

    private final double C;

    public FahrenheitExample(double c) {
        C = c;
        neg();
        sum();

        printResult();

    }

    private void neg() {
        result1 = C * 9 / 5;
    }

    private void sum() {
        result2 = result1 + 32;
    }

    public void printResult() {
        System.out.println(getClass().getName() + " = " + result2);
    }
}