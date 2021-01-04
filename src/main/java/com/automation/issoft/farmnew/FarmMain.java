package com.automation.issoft.farmnew;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class FarmMain {

    public static void main(String[] args) throws IOException {

//        String jsonFarms = "src/main/resources/farmsList.json";
        String jsonFarms = "src/main/resources/farmCowList.json";
        String originalContent = new String(Files.readAllBytes(Paths.get(jsonFarms)));

        List<Farm> farms = new ArrayList<>();
        AgroComplex agroComplex1 = new AgroComplex("volodichi", farms, 5);


        List<MilkFarm> milkFarms = new ObjectMapper().readValue(originalContent, new TypeReference<List<MilkFarm>>() {
        });

        farms.addAll(milkFarms);


//        Farm milkFarm = new MilkFarm("MilkFarm",20, 8, 3);
//        Farm milkSavushkinFarm = new MilkFarm("Savushkin",30, 10, 2);
//        Farm milkNatureFarm = new MilkFarm("NatureFarm",5, 6, 5);
//
//        farms.add(milkFarm);
//        farms.add(milkSavushkinFarm);
//        farms.add(milkNatureFarm);

        System.out.println("The total income of agrocomplex " + agroComplex1.name + " for " + agroComplex1.workingDays + " days is " + agroComplex1.agroComplexIncome(farms) + " USD");


    }
}
