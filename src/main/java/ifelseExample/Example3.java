package ifelseExample;

public class Example3 {
    public static void main(String[] args) {
       boolean goodWeather = true;
        boolean freeTime = true;

        if (goodWeather) {

            System.out.println("Едем за город");

            if (freeTime) {

                System.out.println("катаемся на лошади");
            }
        }
//        if (goodWeather && freeTime) {
//            System.out.println("Едем за город, катаемся на лошади");
//        }
    }
}
