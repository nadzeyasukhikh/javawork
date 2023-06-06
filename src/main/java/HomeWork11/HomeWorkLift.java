package HomeWork11;

import java.util.Scanner;

public class HomeWorkLift {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите высоту здания H: ");
            int H = sc.nextInt();

            System.out.print("Введите количество этажей, на которые лифт поднимается за один раз N: ");
            int N = sc.nextInt();

            System.out.print("Введите количество этажей, на которые лифт спускается за один раз M: ");
            int M = sc.nextInt();
            sc.close();

            int difference = H - N;
            int lifts = difference / (N - M);

            if (difference % (N - M) != 0) {
                lifts += 1;
            }

            System.out.println("Количество подъемов, необходимых лифту: " + lifts);
        }
    }


