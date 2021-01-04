package com.automation.issoft.random;

public class Operation {


    public static void main(String[] args) {
//        int x = 10;
//        int y = 0;
//
//        boolean isMale = true;
//
//        x = x + (isMale?10:-10);
//
//        if(isMale){
//            x += 10;
//        }else{
//            x -=10;
//        }
//
//        if (y > 5) {
//            System.out.println("y>5");
//        } else {
//            if (y == 0) {
//                System.out.println("y = 0");
//            } else {
//                System.out.println("Result " + x / y);
//            }
//        }
//
//        int z = 5;
//
//        switch(y){
//            case 5: case 43:{System.out.println("5");break;}
//            case 0:{System.out.println("0");break;}
//            case 7:{System.out.println("0");break;}
//
//            default:{System.out.println("do nothing");break;}
//        }
//
        int kg = 55;

        do {
            System.out.println("going to gym");
            kg = kg - 1;
        } while (kg > 50);

//        if (y > 5) {
//            System.out.println("y>5");
//        } else {
//            if (y == 0) {
//                System.out.println("y = 0");
//            } else {
//                System.out.println("Result " + x / y);
//            }
//        }
//        String pass1 = "a";
//        String pass2 = "b";
//        String pass3 = "c";


        String[] pass = new String[3];
        pass[0] = "a";
        pass[1] = "b";
        pass[2] = "c";


        }

    public static void feedAllPass(String[] pass){
        System.out.println("kill all");

        for (int i = 0; i < pass.length; i++){
            System.out.println("feeding pass with the name " + pass[i]);
        }
        for (String currentPass: pass){
            System.out.println("feeding " + currentPass);
            System.out.println("kill " + currentPass);
        }

    }
}


//
//        Scanner scanner = new Scanner(System.in);
////        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        System.out.println("Your name is " + " and your age is " + age);
//
////        Scanner user_input_y = new Scanner(System.in);
////        System.out.println("Enter Y variable");
////        double y = user_input_y.nextDouble();
////        System.out.println("The first variable is Y = " + y);