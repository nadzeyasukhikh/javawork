package homeWork7;

import java.util.Scanner;

public class HomeWorkIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int dayOfWeek = sc.nextInt();
        sc.close();

        if (dayOfWeek == 1)
            System.out.println("1 - " + "Понедельник");
        else if (dayOfWeek == 2)
            System.out.println("2 - " + "Вторник");
        else if (dayOfWeek == 3)
            System.out.println("3 - " + "Среда");
        else if (dayOfWeek == 4)
            System.out.println("4 - " + "Четверг");
        else if (dayOfWeek == 5)
            System.out.println("5 - " + "Пятница");
        else if (dayOfWeek == 6)
            System.out.println("6 - " + "Суббота");
        else if (dayOfWeek == 7)
            System.out.println("7 - " + "Воскресенье");
        else
            System.out.println("Ошибка");

    }
}
