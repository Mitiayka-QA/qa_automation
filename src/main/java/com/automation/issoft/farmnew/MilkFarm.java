package com.automation.issoft.farmnew;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MilkFarm extends Farm {

    double milkLiterPrice; //separate class PriceSheet in future
    List<Cow> cows;

    public MilkFarm() {
    }

    public MilkFarm(String farmName, int animalsAmount, double milkLiterPrice, List cows) {
        super(farmName, animalsAmount);
        this.milkLiterPrice = milkLiterPrice;
        this.cows = cows;
    }


//    public double bareIncome(int animalsAmount) {
//        return cows.size() * animalProductivity * milkLiterPrice;
//    }

    @Override
    public double bareIncome() {
        double bareIncome = 0;

        for (Cow cow : cows) {
            bareIncome += cow.getCoefficient() * milkLiterPrice;
        }
        return bareIncome;
    }

    @Override
    public double totalIncome(double bareIncome) {
        return bareIncome * 0.75;
    }
}
