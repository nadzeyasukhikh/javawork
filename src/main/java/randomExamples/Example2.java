package randomExamples;

public class Example2 {
    public static void main(String[] args) {
// [3;20] - как целое число

        // первый подход (не совсем верный) -> не будет включаться 20
        // [0;1) * 17 = ([0;17) ~ int) == [0;16] - целые значения
        // [0;17) + 3 = [3;20)  = эквивалент [3;19]
        // [0;16] + 3 = [3;19]  = эквивалент [3;20)

        // второй подход (верный) -> будет включаться 20
        // [0;1) * (17 + 1) = ([0;18) ~ int) == [0;17] - целые числа
        // [0;17] + 3 = [3;20]

        // формула трансформации из [0;1) -> [min; max)
        // (int) (Math.random() * (max - min)) + min

        // формула трансформации из [0;1) -> [min; max]
        // (int)(Math.random() * ((max - min) + 1)) + min

      double q =  Math.random();

      int w = (int) (Math.random() * 100);

      int e = (int) (Math.random() * (17 + 1)) + 3;
        System.out.println(e);
    }
}
