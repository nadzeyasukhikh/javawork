package switchExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter pls your branch [Berlin, Tel-Aviv, New-York]:");
        String branch = sc.nextLine();
        sc.close();

        switch (branch) {
            case "Berlin":
                System.out.print("Branch Berlin");
                break;

            case "Tel-Aviv":
                System.out.print("Branch Tel-Aviv");
                break;

            case "New-York":
                System.out.print("Branch New-York");
                break;

            default:
                System.out.print("Selected branch is wrong");
        }

        switch (year) {
            case 1:
                System.out.println(", year 1");
                break;
            case 2:
                System.out.println(", year 2");
                break;
            default:
                System.out.println("year of education is wrong");
        }

    }
}