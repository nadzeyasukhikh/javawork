package com.auto.germany;

public class Car {

    public double power;
    public int year;
    public String fabric;


    public Car(double power, int year, String fabric) {
         this(power, year);
        this.fabric = fabric;
        System.out.println("completed Car(3 arg)");
    }



    public Car(double power, int year) {
       this(power);
       this.year = year;
       fabric = "VW";
        System.out.println("completed Car(2 arg)");
    }

    public Car(double power) {
        this.power = power;
        year = 2010;
        fabric = "VW";
        System.out.println("completed Car(1 arg)");
    }

    public Car() {
        power = 99;
        year = 2010;
        fabric = "VW";
        System.out.println("completed Car(0 arg)");
    }
}
