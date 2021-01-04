package com.automation.issoft.cars;

public class Taxi {
    double fuelTank = 20;

    public void fillTank(double fillAmount) {
        fuelTank = fuelTank + fillAmount;
        System.out.println("The current fuel amount is " + fuelTank);
    }

    public void drive(String[] destinations) {
//        for (int i = 0; i < destinations.length; i++) {
//            String city = destinations[i];
            for (String city: destinations){

            if (fuelTank > city.length()) {
                System.out.println("Driving to " + city);
                fuelTank = fuelTank - city.length();
                System.out.println("Current amount of fuel is " + fuelTank);
            } else {

                System.out.println("No enough fuel for the trip to " + city);
                System.out.println("The current amount is " + fuelTank);
            }
        }
    }

//    public void drive(String destination){
//        double fuelRequired = destination.length();
//        System.out.println("Required fuel is " + fuelRequired);
//
//        if(fuelRequired <= fuelTank){
//            System.out.println("Going to " + destination);
//            fuelTank = fuelTank - fuelRequired;
//        }else{
//            System.out.println("Not enough fuel, choose closer destination or fill the tank");
//            System.out.println("The current amount is " + fuelTank);
//        }
//    }

}
