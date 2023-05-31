package breakContinueReturn;

public class BreakExample {
    public static void main(String[] args) {

        int[] a ={5,8,2,4,1,0};


        for (int i = 0; i < a.length; i++) {

            if (a[i] == 4)
                break;

            System.out.println(a[i]);

        }
        System.out.println("Last line");
    }
}
