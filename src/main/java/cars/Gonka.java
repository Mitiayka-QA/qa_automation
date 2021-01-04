package cars;

public class Gonka {
    int engineVolume = 8000; // cm3
    double averageSpeed = 300; // km per hour
    double tankCapacity = 80;// liters
    int doors = 2;
    int passengerPlaces = 0;
    boolean feesPossibility = true;

    public void drive(String destination) {
        System.out.println("Our destination is " + destination);
        System.out.println("Approximate time of arrival " + (destination.length() / (averageSpeed / 100))
                + " hours because we are driving " + averageSpeed + " per hour");
        tankCapacity = tankCapacity - (destination.length() * (engineVolume / 1000));
        System.out.println("Fuel left " + tankCapacity + " liters");
    }
}
