package homeWork6;

import java.util.Random;

public class WorkTime {
    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt(28801);
        System.out.println("Осталось " + n + " секунд");

        int hours = n / 3600;
        if (hours > 0) {
            System.out.println("Осталось " + hours + " час" + getHourEnding(hours));
        } else {
            System.out.println("Осталось менее часа");
        }
    }

    private static String getHourEnding(int hours) {


        if (hours >= 2 && hours <= 4) {
            return "а";
        } else if (hours >= 5 || hours == 0) {
            return "ов";
        } else {
            return "";
        }
    }
    }

