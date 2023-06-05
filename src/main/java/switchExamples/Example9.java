package switchExamples;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls number of day in week [1-7]: ");
        int day = sc.nextInt();
        sc.close();
        System.out.println(getNameOfDayInWeek(day));
    }

    public static String getNameOfDayInWeek(int dayOfWeek) {




        return switch (dayOfWeek) {
            case 1,2,3,4,5 ->  "Working day";
            case 6,7       ->  "Weekend";
            default        ->  "Error";

        };
    }
}