package com.automation.issoft.farmnew;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
abstract class Animal {

    int age;
    @JsonProperty("isfemale")
    boolean isFemale;

    public Animal() {
    }

    public Animal(int age, boolean isFemale) {
        this.age = age;
        this.isFemale = isFemale;
    }

    abstract public int getCoefficient();

//    abstract public double animalIncome();

}
