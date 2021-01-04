package com.automation.issoft.housesnew;

import java.util.ArrayList;
import java.util.List;

public class BasicHouse {

    List<Flat> flats = new ArrayList<>();

    public BasicHouse(List<Flat> flats) {
        this.flats = flats;
    }

    public double calcMonthRent(List<Flat> flats) {
        double totalRentPerHouse = 0;
        for (Flat flat : flats) {
            totalRentPerHouse += flat.getSquareMeters() / flat.getNumberOfTenants();
        }
        return totalRentPerHouse;
    }
}

