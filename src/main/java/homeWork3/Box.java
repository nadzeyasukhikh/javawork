package homeWork3;

public class Box {

    public double width;
     public double height;
    public double length;

    public Box(double width, double height, double length) {
     this.width = width;
     this.height = height;
     this.length = length;
     double volume = width * height * length;

        System.out.println("Объем коробки: " + volume);
    }


}
