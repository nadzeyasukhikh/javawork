package breakContinueReturn;

public class ContinueExample {
    public static void main(String[] args) {
        int[] a ={5,8,2,4,1,0};


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i] + " ");

            if (a[i] % 2 ==0) {
                System.out.println();
                continue;
            }
            System.out.println("не делится без остатка");

        }
    }
}
