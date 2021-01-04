package com.automation.issoft.farmnew;

import lombok.Data;

import java.util.List;

@Data
abstract class Farm {

    String farmName;
    List<Animal> animals;
    int animalsAmount;

    public Farm() {

    }

    public Farm(String farmName, int animalsAmount) {
        this.farmName = farmName;
        this.animalsAmount = animalsAmount;
    }

    public abstract double bareIncome();

    public abstract double totalIncome(double bareIncome);

}
