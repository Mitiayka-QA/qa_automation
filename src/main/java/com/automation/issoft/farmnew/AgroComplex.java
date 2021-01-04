package com.automation.issoft.farmnew;

import java.util.List;

public class AgroComplex {
    List<Farm> farms;
    String name;
    int workingDays;

    public AgroComplex(String name, List<Farm> farms, int workingDays) {
        this.name = name;
        this.farms = farms;
        this.workingDays = workingDays;
    }

    public double agroComplexIncome(List<Farm> farms) {
        double incomeByFarm = 0;
        for (Farm farm : farms) {

            incomeByFarm += farm.totalIncome(farm.bareIncome());
        }
        return incomeByFarm * workingDays;
    }

//    public void addAll(List<Farm> farms) {
//        for (Farm farm : farms) {
//            farms.add(farm);
//        }
//    }

}
