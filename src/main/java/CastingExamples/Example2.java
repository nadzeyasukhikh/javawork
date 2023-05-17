package CastingExamples;

public class Example2 {
    public static void main(String[] args) {
        //primeri s syzeniem


        byte q = 10;
        int w = 140;
        double e = 134.56;
// primer bez poteri dannix
        float a =(float) e;
        short b = (short) w;

// primeri s poterey dannix
        int c = (int) e;
        byte d = (byte) w;
        byte f = (byte) e;

        System.out.println(f);

        //primitive       class
        //boolean        Boolean
        //short         Short
        //int         Integer (!)
        //long       Long
        //double       Double
        //char        Character (!)
    }
}
