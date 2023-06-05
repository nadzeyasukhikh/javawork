package Javalessons;

public class Lesson3 {
    public static void main(String[] args) {
        calculator(20,5,'+');
    }
    public static void calculator(int a, int b, char c){
        if (c=='+')
            System.out.println(a+b);
        else if (c=='-')
            System.out.println(a-b);
        else if (c=='*')
            System.out.println(a*b);
        else if (c=='/'){
            if (b!=0)
                System.out.println(a/b);
            else
                System.out.println("You can't divide by 0");
        }
    }
}