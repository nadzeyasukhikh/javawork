package switchExamples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls year of education [1 - 2]:");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter pls your branch [Berlin, Tel-Aviv, New-York]:");
        String branch = sc.nextLine();
        sc.close();

        switch (year) {
            case 1:
                switch (branch) {
                    case "Berlin":
                        System.out.println("branch Berlin - year 1" );
                        break;

                    case "Tel-Aviv":
                        System.out.println("branch Tel-Aviv - year 1");
                        break;

                    case "New-York":
                        System.out.println("branch New-York - year1");
                        break;

                    default:
                        System.out.println("Selected branch is wrong");
                }
                break;

            case 2:
                switch (branch) {
                    case "Berlin":
                        System.out.println("branch Berlin - year 2");
                        break;

                    case "Tel-Aviv":
                        System.out.println("branch Tel-Aviv - year 2");
                        break;

                    case "New-York":
                        System.out.println("branch New-York - year2");
                        break;

                    default:
                        System.out.println("Selected branch is wrong");
                }
                break;
        }
    }
}



