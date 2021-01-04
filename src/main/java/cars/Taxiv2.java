package cars;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Taxiv2 {
    //    cars.Taxiv2 defaultTaxi = new cars.Taxiv2();
    double fuelTank = 10;
    int yesNo;

    public void fillTank(double fillAmount) {
        fuelTank = fuelTank + fillAmount;
        System.out.println("The current fuel amount is " + fuelTank);
    }

    public void drive(List<String> destinations) {
//        for (int i = 0; i < destinations.size(); i++) {
//            String tempDestination = destinations.get(i);
        for (String tempDestination : destinations) {

            if (fuelTank >= tempDestination.length()) {
                System.out.println("Driving to " + tempDestination);
                fuelTank = fuelTank - tempDestination.length();
                System.out.println("Current amount of fuel is " + fuelTank);
            } else {
                if (fuelTank < tempDestination.length()) {
                    System.out.println("No enough fuel for the trip to " + tempDestination);
                    System.out.println("The current amount is " + fuelTank);
                    System.out.println("Wanna fill a tank? If yes please type 1, if no - type 2");
                    Scanner userInput = new Scanner(System.in);
                    yesNo = userInput.nextInt(); // create separate method!!!
                }
            }

            if (yesNo == 1) {
                System.out.println("Please, enter amount of litres");
                Scanner userInput = new Scanner(System.in);
                int litresAmount = userInput.nextInt();
                fillTank(litresAmount);
                System.out.println("The current amount is " + fuelTank);
                System.out.println("Driving to " + tempDestination);
                System.out.println("You are arrived at the " + tempDestination + " Thank you for choosing our service. Please rate us in the Google/Apple app store!");
                fuelTank = fuelTank - tempDestination.length();
                System.out.println(fuelTank + " litres left.");// may be add one additional if (fuelTank < tempDestination.length())

            } else {
                if (yesNo == 2) {
                    System.out.println("You are staying in the " + tempDestination + ". Enjoy your stay!");
                } else {
                    if (yesNo != 0 && yesNo != 1 && yesNo != 2) {
                        System.out.println("You've typed some bullshit!");
                    }
                }
            }
        }
    }
}


//    public void drive(String destination){
//        double fuelRequired = destination.length();
//        System.out.println("Required fuel is " + fuelRequired);
//
//        if(fuelRequired <= fuelTank){
//            System.out.println("Going to " + destination);
//            fuelTank = fuelTank - fuelRequired;
//        }else{
//            System.out.println("Not enough fuel, choose closer destination or fill the tank");
//            System.out.println("The current amount is " + fuelTank);
//        }
//    }

//                    yesNo = Integer.parseInt(userInput.next());
//                    fuelTank = fuelTank + litresAmount;

