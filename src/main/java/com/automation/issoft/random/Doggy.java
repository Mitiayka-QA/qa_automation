package com.automation.issoft.random;

public class Doggy {
    String name;
    int weight = 5;

    public void increaseWeight() {
        weight = weight + 5;
        System.out.println(name + " weight is " + weight);
    }

    public void bark() {
        System.out.println(name + " doggy makes woof woof");
    }
}
