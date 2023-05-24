package HomeWork4Converter;

public class ConverterInit {
    public static void main(String[] args) {
    // kelvin = celsius + 273.15
      //fahrenheit = celsius * 9/5 + 32


        double c = 25.0;

        double resultK = c + 273.15;
        double resultF = c * 9/5 + 32;
        System.out.println("По Кельвину: " + resultK);
        System.out.println("По Фаренгейту: " + resultF);

        KelvinExample k1 = new KelvinExample(c);
        k1.printResult();

        FahrenheitExample f1 = new FahrenheitExample(c);
        f1.printResult();

        KelvinExample1 k2 = new KelvinExample1(c);
        k2.getPrintString();

        FahrenheitExample1 f2 = new FahrenheitExample1(c);
        f2.getPrintString();
    }

}
