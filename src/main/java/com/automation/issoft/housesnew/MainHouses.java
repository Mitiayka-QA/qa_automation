package com.automation.issoft.housesnew;

import java.util.ArrayList;
import java.util.List;

public class MainHouses {
    public static void main(String[] args) {
        List<BasicHouse> street = new ArrayList<>();

        Flat townHouseFlat1 = new Flat(50, 2);
        Flat townHouseFlat2 = new Flat(100, 2);
        Flat townHouseFlat3 = new Flat(80, 1);

        List<Flat> townHouseFlats = new ArrayList<>();
        townHouseFlats.add(townHouseFlat1);
        townHouseFlats.add(townHouseFlat2);
        townHouseFlats.add(townHouseFlat3);

        Flat manyFlatsFlat1 = new Flat(30, 1);
        Flat manyFlatsFlat2 = new Flat(100, 4);
        Flat manyFlatsFlat3 = new Flat(55, 2);

        List<Flat> manyFlatsFlats = new ArrayList<>();
        manyFlatsFlats.add(manyFlatsFlat1);
        manyFlatsFlats.add(manyFlatsFlat2);
        manyFlatsFlats.add(manyFlatsFlat3);

        BasicHouse townHouse1 = new TownHouse(townHouseFlats);
//        TownHouse townHouse1 = new TownHouse(townHouseFlats);
        ManyFlatsHouse manyFlatsHouse1 = new ManyFlatsHouse(manyFlatsFlats);

        street.add(townHouse1);
        street.add(manyFlatsHouse1);
        double totalRentAmount = 0;

        for (BasicHouse basicHouse : street) {
            totalRentAmount += basicHouse.calcMonthRent(basicHouse.flats);
        }
        System.out.println(totalRentAmount);
    }
}
