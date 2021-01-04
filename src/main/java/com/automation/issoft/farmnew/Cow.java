package com.automation.issoft.farmnew;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Cow extends Animal {

    public Cow(int age, boolean isFemale) {
        super(age, isFemale);
    }

    public Cow() {
    }

    @Override
    public int getCoefficient() {

        switch (age) {
            case 1:
                return 10;
            case 2:
                return 9;
            case 3:
                return 8;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 5;
            case 7:
                return 4;
            case 8:
                return 3;
            case 9:
                return 2;
            case 10:
                return 1;
            default:
                return 1;
        }
    }

//    boolean milkable;
//    boolean meetable;

}