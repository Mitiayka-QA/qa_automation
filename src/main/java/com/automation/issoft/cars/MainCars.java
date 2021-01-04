package com.automation.issoft.cars;

public class MainCars {


    public static void main(String[] args) {

        String city = "Chernigov";

        Sofik scania = new Sofik();
        scania.drive(city);

        Gonka ferrari = new Gonka();
        ferrari.drive(city);

        LuxuryCar cadillac = new LuxuryCar();
        cadillac.drive(city);
    }
}
