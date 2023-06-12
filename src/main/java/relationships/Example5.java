package relationships;

// примеры анонимных вложенных классов (на базе интерфейса)
public class Example5 {

    public static void main(String[] args) {

        TVable tv = new TVable() {
            @Override
            public void show() {
                System.out.println("Show must go on");
            }

            @Override
            public void testShow() {
                System.out.println("Testshow must go on");
            }
        };

        tv.show();
        tv.testShow();

    }
}

interface TVable {
    void show();
    void testShow();
}