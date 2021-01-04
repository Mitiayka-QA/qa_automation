package com.automation.issoft.cars;

import java.util.HashMap;
import java.util.Map;

public class ParkingMap {

    Map<String, NewCar> parkingPlaces = new HashMap<>();

    public void parkCar(NewCar newCar, String place){
        parkingPlaces.put(place, newCar);
    }

    public NewCar unparkCar(String place){
        NewCar returnedCar = parkingPlaces.remove(place);
        return returnedCar;
    }

    public int totalOccupied(){
        return parkingPlaces.size();
    }

    public static void main(String[] args) {
        Parking parking = new Parking();

//        ParkingPlace pp2 = new ParkingPlace();
//        pp2.carNew.color = "white";

        NewCar newCar1 = new NewCar("blue", "bmw");
        System.out.println(newCar1);
        parking.parkCar(newCar1, "b12");
        System.out.println("1111  " + parking.totalOccupied());

        NewCar newCar2 = new NewCar("red", "polo");
        System.out.println(newCar2);
        parking.parkCar(newCar2, "a7");

        System.out.println("2222   " + parking.totalOccupied());

        NewCar returnedCar = parking.unparkCar("b12");
        System.out.println(returnedCar);

        System.out.println(parking.unparkCar("c43"));

    }
}


