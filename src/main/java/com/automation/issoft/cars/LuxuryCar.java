package com.automation.issoft.cars;

public class LuxuryCar {
    int engineVolume = 3000; // cm3
    double averageSpeed = 150; // km per hour
    double tankCapacity = 100;// liters
    int doors = 6;
    int passengerPlaces = 8;
    int tonnage;
    boolean feesPossibility = false;
    String levelOfComfort = "ofigennyi";

    public void drive(String destination) {
        System.out.println("Our destination is " + destination + " with level of comfort " + levelOfComfort);
        double time = destination.length() / (averageSpeed / 100);
        System.out.println(time);
        System.out.println("Approximate time of arrival " + time + " hours");
        tankCapacity = tankCapacity - (destination.length() * (engineVolume / 1000));
        System.out.println("Fuel left " + tankCapacity + " liters");
    }
}
