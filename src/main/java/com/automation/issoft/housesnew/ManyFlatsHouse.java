package com.automation.issoft.housesnew;

import java.util.List;

public class ManyFlatsHouse extends BasicHouse {

    public ManyFlatsHouse(List<Flat> flats) {
        super(flats);
    }


    @Override
    public double calcMonthRent(List<Flat> flats) {
        return super.calcMonthRent(flats) * 0.5;

//        double totalRentPerHouse = 0;
//        for (Flat flat : flats) {
//            totalRentPerHouse += flat.getSquareMeters() / flat.getNumberOfTenants();
//        }
//        return totalRentPerHouse;
    }
}
