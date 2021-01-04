package com.automation.issoft.farms;

import java.util.List;

public class MeetFarm implements Farm {

    List<Cow> cows;
    double basePricePerKilo;

    public MeetFarm(List<Cow> cows, double basePricePerKilo) {
        this.basePricePerKilo = basePricePerKilo;
        this.cows = cows;
    }

    @Override
    public double collectGoods() {
        double cowsTotalWeight = 0;
        for (Cow cow : cows) {
            cowsTotalWeight += cow.weight;
        }
        return cowsTotalWeight;
    }

    @Override
    public double calcIncome(double cowsTotalWeight) {
        return basePricePerKilo * cowsTotalWeight;
    }

    @Override
    public double calcTaxes(double totalIncome) {
        return totalIncome * 0.17;
    }
}
