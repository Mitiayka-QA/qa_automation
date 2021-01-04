package com.automation.issoft.farms;

import java.util.List;

public class MilkFarm implements Farm{

    int cowsAmount;
    double milkLiters;
    List<Cow> cows;

    @Override
    public double collectGoods() {
        return 0;
    }

    @Override
    public double calcIncome(double cowsTotalMilk) {
        return 0;
    }

    @Override
    public double calcTaxes(double totalIncome) {
        return 0;
    }
}
