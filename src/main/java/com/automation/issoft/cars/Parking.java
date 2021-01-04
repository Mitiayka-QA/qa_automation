package com.automation.issoft.cars;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<ParkingPlace> parkingPlaces = new ArrayList<>();


    public void parkCar(NewCar newCar, String place) {

        ParkingPlace parkingPlace = new ParkingPlace();
        parkingPlace.carNew = newCar;
        parkingPlace.number = place;
        parkingPlace.isWashed = true;
        parkingPlaces.add(parkingPlace);
    }

    public NewCar unparkCar(String place) {
//        parkingPlaces.get();
//        parkingPlaces.remove();

//        ParkingPlace pplace = parkingPlaces.remove(1);
//        NewCar newCar = pplace.carNew;
//        return newCar;

//        for (int i = 0; i < parkingPlaces.size(); i++) {
//            ParkingPlace pp = parkingPlaces.get(i);
//        }

        for (ParkingPlace pp : parkingPlaces) {
            if (pp.number.equals(place)) {
                return pp.carNew;
            }
        }
        return null;
    }

    public int totalOccupied() {
        return parkingPlaces.size();
    }

//    public static void main(String[] args) {
//        Parking parking = new Parking();
//
////        ParkingPlace pp2 = new ParkingPlace();
////        pp2.carNew.color = "white";
//
//        NewCar newCar1 = new NewCar("blue", "bmw");
//        parking.parkCar(newCar1, "b12");
//        System.out.println("1111  " + parking.totalOccupied());
//
//        NewCar newCar2 = new NewCar("red", "polo");
//        System.out.println(newCar2);
//        parking.parkCar(newCar2, "a7");
//
//        System.out.println("2222   " + parking.totalOccupied());
//
//        NewCar returnedCar = parking.unparkCar("b12");
//        System.out.println(returnedCar);
//
//        System.out.println(parking.unparkCar("c43"));
//
//    }
}