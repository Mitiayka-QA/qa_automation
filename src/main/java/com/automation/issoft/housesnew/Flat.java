package com.automation.issoft.housesnew;

public class Flat {
    private double squareMeters;
    private int numberOfTenants;

    public Flat(double squareMeters, int numberOfTenants) {
        this.squareMeters = squareMeters;
        this.numberOfTenants = numberOfTenants;
    }

//    public double calcMonthRent(double squareMeters, int numberOfTenants){
//        return squareMeters / numberOfTenants;
//
//    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }
}