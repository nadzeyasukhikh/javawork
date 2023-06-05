package switchExamples;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls number of mons: ");
        int month = sc.nextInt();
        sc.close();

      String result = switch (month) {

            case 1, 2, 12    -> "Winter";
            case 3, 4, 5     -> "Spring";
            case 6, 7, 8     -> "Summer";
            case 9, 10, 11    -> "Autumn";
            default           -> "error";
        };

        System.out.println(result);
        System.out.println("end of file");
    }

}

