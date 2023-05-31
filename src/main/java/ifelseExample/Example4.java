package ifelseExample;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // если будет плохая погода - останемся дома, будем смотреть фильм.
        // Иначе если погода будет просто отличная - купим билеты и уедем в другой
        // город на ярмарку.
        // Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls your weather(+ - good, 0 - undefined, - bad): ");

        int weather = sc.nextInt();
        sc.close();

//        if (weather < 0) {
//            System.out.println("останемся дома, будем смотреть фильм.");
//        } else {
//            if (weather > 0) {
//                System.out.println("купим билеты и уедем в другой город на ярмарку.");
//            } else {
//
//                    System.out.println("тогда встретимся с друзьями в нашем доме.");
//                }
//
//            }
        if (weather < 0) {
            System.out.println("останемся дома, будем смотреть фильм.");
        } else if (weather > 0) {
            System.out.println("купим билеты и уедем в другой город на ярмарку.");
        } else {
            System.out.println("тогда встретимся с друзьями в нашем доме.");
        }
       }
   }
