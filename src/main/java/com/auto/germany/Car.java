package com.auto.germany;

public class Car {

    private double power;
    private int year;
    private String fabric;


    public Car(double power, int year, String fabric) {
         this(power, year);
        this.fabric = fabric;
       print(3);
    }



    public Car(double power, int year) {
       this(power);
       this.year = year;
       fabric = "VW";
        print(2);
    }

    public Car(double power) {
        this.power = power;
        year = 2010;
        fabric = "VW";
       print(1);
    }

    public Car() {
        power = 99;
        year = 2010;
        fabric = "VW";
        print(0);
    }
    private void print(int q) {
        System.out.println("completed german Car(" + q + " arg)");

    }

public void printCarProperties() {
    System.out.println(power);
    System.out.println(year);
    System.out.println(fabric.toUpperCase());
}
//getters
    public double getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public String getFabric() {
        return fabric;
    }

//    setters


    public void setPower(double power) {
        this.power = power;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
