import java.util.Scanner;

public class StringExamples1 {
    public static void main(String[] args) {

        String input1 = "Hello java, it s 280323m";
        String input2 = new String("Hello java");

        System.out.println( input1.length());
        System.out.println(input2.length());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls line: ");
//        String input3 = sc.nextLine();
        System.out.println("Length of input line is " + sc.nextLine().length());

        sc.close();
    }
}
