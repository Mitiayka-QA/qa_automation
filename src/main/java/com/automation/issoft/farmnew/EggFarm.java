//package com.automation.issoft.farmnew;
//
//public class EggFarm extends Farm {
//
//    double eggDozenPrice;
//
//    public EggFarm(int animalsAmount, double animalProductivity, double eggDozenPrice) {
//        super(animalsAmount, animalProductivity);
//        this.eggDozenPrice = eggDozenPrice;
//    }
//
//    @Override
//    public double bareIncome(int animalsAmount) {
//        return ((animalsAmount * 6) / 12) * eggDozenPrice;
//
//    }
//
//    @Override
//    public double totalIncome(double bareIncome) {
//        return bareIncome * 0.85;
//    }
//}
