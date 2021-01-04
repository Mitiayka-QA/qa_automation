package com.automation.issoft.random;

public class Car {
    String model ="vw polo";//null
    String color = "blue";//null
    int doorsCount = 2;//0
    double fuelLevel = 55.5;// 0.0
//    FuelTankLevel fuelOnDashboard = FuelTankLevel.FULL;

    public Car(String carColor){
        System.out.println("yo");
        color = carColor;
    }

    public static void main(String[] args) {
//        com.automation.issoft.Car newCar1 = new com.automation.issoft.Car(carColor:"white");
        System.out.println("hi");

//        newCar1.drive();
//        newCar1.fullTank(10);
//        newCar1.drive();

    }

    public void drive() {
        System.out.println("I'm " + model + " with color " + color +" driving to hell" + " and fuel left = " + fuelLevel);
        fuelLevel = fuelLevel - 5;
    }

    public void fullTank(double liters){
        fuelLevel = fuelLevel + liters;
    }

    public String orderInMacDac(String product, int quantity, boolean withIce) {
        String returnProduct = "cheeseburger";
        return returnProduct;
    }



}


//    InputStream inputStream = System.in;
//    Reader inputStreamReader = new InputStreamReader(inputStream);
//    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//    String name = bufferedReader.readLine();
//    String sAge = bufferedReader.readLine();
//    int nAge = Integer.parseInt(sAge);