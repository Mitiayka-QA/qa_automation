package com.automation.issoft.farms;

import java.util.ArrayList;
import java.util.List;

public class MainFarm {

    public static void main(String[] args) {

        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow(86,5));
        cows.add(new Cow(86,5));
        cows.add(new Cow(86,5));
        cows.add(new Cow(86,5));
        cows.add(new Cow(86,5));

        MeetFarm slaughterFarm1 = new MeetFarm(cows, 17);
        double totalIncome = slaughterFarm1.calcIncome(slaughterFarm1.collectGoods());
        System.out.println("Total income: " + totalIncome);

        System.out.println("Money after taxes: " + slaughterFarm1.calcTaxes(totalIncome));
    }
}
