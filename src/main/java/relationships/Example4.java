package relationships;

public class Example4 {
    public static void testMethod() {
        System.out.println("Test method is correct");
    }

    static class Inner2 {
        public static void printMethodInner2() {
            System.out.println("Method inside static class is correct");
        }
    }
    public static void main(String[] args) {
       Inner2.printMethodInner2();


    }
}
