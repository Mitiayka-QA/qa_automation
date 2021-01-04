package com.automation.issoft.cars;

public class Sofik {
    int engineVolume = 5000; // cm3
    double averageSpeed = 120; // km per hour
    double tankCapacity = 300;// liters
    int doors = 2;
    int passengerPlaces = 1;
    int tonnage = 8;// tonnes

    public void drive(String destination) {
        System.out.println("Our destination is " + destination);
        System.out.println("Approximate time of arrival " + (destination.length() / (averageSpeed / 100)) + " hours");
        tankCapacity = tankCapacity - (destination.length() * (engineVolume / 1000));
        System.out.println("Fuel left " + tankCapacity + " liters");
    }

}
