public class StringExample3 {
    public static void main(String[] args) {
        String input1 = "Hello java, it s 280323m";

        System.out.println(input1);
        String result1 = input1.substring(10);
        System.out.println(result1);

        String result2 = input1.substring(6,10);
        System.out.println(result2);
    }
}
