package cars;

import java.util.ArrayList;
import java.util.List;

public class MainTaxi {


    public static void main(String[] args) {

//        String[] destinations1 = new String[3];
//        destinations[0] = "Brest";
//        destinations[1] = "Gomel";
//        destinations[2] = "Vitebsk";


        List<String> destinations = new ArrayList<>();
        ArrayList<String> tempDest = new ArrayList<>();
        destinations.add("Brest");
        destinations.add("Gomel");
        destinations.add("Vitebsk");

//      destination[3] = "Minsk";
//      destination[4] = "Grodno";
//      destination[5] = "Mogilev";

//        cars.Taxi newTaxi = new cars.Taxi();
//        newTaxi.drive(destinations);
//        newTaxi.fillTank(20);


//        Human vasiliy = new Human();
//        vasiliy.name = "Vasiliy";
//        vasiliy.moneyAmount = 30;

        Taxiv2 newTaxi2 = new Taxiv2();
        newTaxi2.drive(destinations);


//        newtaxi.drive("Chernigov");




    }
}





