package com.automation.issoft.random;

public class RandomDoggy {
    public static void main(String[] args) {
        Doggy jonny = new Doggy();
        jonny.name = "Jonny";

        Doggy[] myDogs = new Doggy[3];
        myDogs[0] = new Doggy();
        myDogs[1] = new Doggy();
        myDogs[2] = jonny;

        myDogs[0].name = "Sally";
        myDogs[1].name = "Martha";

//        int i = 0;

//        while (i < myDogs.length) {
//            myDogs[i].increaseWeight();
//            i++;
//        }

        for (int i = 0; i < myDogs.length; i++) {

            myDogs[i].increaseWeight();
        }



    }
}
