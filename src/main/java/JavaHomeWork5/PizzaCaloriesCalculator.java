package JavaHomeWork5;

public class PizzaCaloriesCalculator {


        public static void main(String[] args) {
            int smallD = 24;
            int larD = 28;

            int smallerArea = calcPizza(smallD);
            int largerArea = calcPizza(larD);

            int extraCalories = (largerArea - smallerArea) * 40;

            System.out.println("Вы съедите лишних " + extraCalories + " калорий.");
        }

        public static int calcPizza(int diameter) {

            double area = Math.PI * Math.pow(diameter, 2) / 4;
            return (int) (area);
        }
    }



