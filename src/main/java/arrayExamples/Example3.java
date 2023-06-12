package arrayExamples;

public class Example3 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7};

        // создаем копию через .clone() метод
        int[] b = a.clone();

        printArray(a, "A");
        printArray(b, "B");

        b[1] = 1000;
//        addTen(b, 10);

        printArray(a, "A");
        printArray(b, "B");
    }

    public static void printArray(int[] input, String label) {
        System.out.print("Array " + label + " = [");
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i] + " ");
        System.out.println("] " + input.hashCode());
    }

    public static void addTen(int[] input, int c) {
        for (int i = 0; i < input.length; i++)
            input[i] += c;
    }
}