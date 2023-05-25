package randomExamples;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {

        int[] arr = {4,3,2,8,5};

        String[] arr2 = {"Alex", "Bob", "Alice", "Anna", "Katrin"};

        Student[] arr3 = {
                new Student("Alex"),
                new Student("Bob"),
                new Student("Alice"),
                new Student("Anna"),
                new Student("Katrin")
        };

        Random r = new Random();
       int choice =  r.nextInt(0,5);


        System.out.println("Index was generated like " + choice);
        System.out.println("Result = " + arr3[choice].getName());
    }
}
class Student {

    private  String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return "Student is " + name;
    }
}


