package com.automation.issoft.random;

import java.util.Scanner;


public class MainRandom {

    public static void main(String[] args) {
//        com.automation.issoft.Calcv1 calc1 = new com.automation.issoft.Calcv1();
//        calc1.sum(3,5);
//        calc1.subtract(3,5);
//        calc1.multiply(3,5);
//        calc1.divide(3,8);

        Calcv2 calc2 = new Calcv2();
        System.out.println("Please select operation: 1 - Sum, 2 - Subtract, 3 - Divide, 4 - Multiply");
        Scanner user_input1 = new Scanner(System.in);
        int select_operation = user_input1.nextInt();

        switch (select_operation){
            case 1: calc2.sum(); break;
            case 2: calc2.subtract(); break;
            case 3: calc2.divide(); break;
            case 4: calc2.multiply(); break;
            default: System.out.println("We don't have such an operation, please call back later!");

        }

//        if (select_operation == 1) {
//            calc2.sum();
//        } else {
//            if (select_operation == 2) {
//                calc2.subtract();
//            } else {
//                if (select_operation == 3) {
//                    calc2.divide();
//                } else {
//                    if (select_operation == 4) {
//                        calc2.multiply();
//                    } else {
//                        System.out.println("We don't have such operation, please call back later!");
//                    }
//                }
//            }
//        }
    }
}
