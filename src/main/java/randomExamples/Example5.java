package randomExamples;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // Задача 3
        // Напишите программу на Java, чтобы поменять местами значения,
        // хранящиеся в двух переменных, без использования третьей переменной

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a var: ");
        int a = sc.nextInt();

        System.out.println("Enter b var: ");
        int b = sc.nextInt();

        System.out.println("Var a = " + a + ", var b = " + b);

       a = a + b;
       b = a - b;
       a = a - b;

        System.out.println("Var a = " + a + ", var b = " + b);

        sc.close();
    }

}
