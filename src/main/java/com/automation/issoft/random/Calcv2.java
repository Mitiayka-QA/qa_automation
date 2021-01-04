package com.automation.issoft.random;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;

public class Calcv2 {

    double previousResult;

    public void sum() {
        Scanner user_input_y = new Scanner(System.in);
        System.out.println("Enter Y variable");
//        String str_y = user_input_y.next();
        double y = user_input_y.nextDouble();
        System.out.println("The first variable is Y = " + y);

        Scanner user_input_x = new Scanner(System.in);
        System.out.println("Enter X variable");
//        String str_x = user_input_x.next();
        double x = user_input_x.nextDouble();
        System.out.println("The second variable is X = " + x);

        double z = y + x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("Sum of the Y and X is " + z);

    }

    public void subtract() {
        Scanner user_input_y = new Scanner(System.in);
        System.out.println("Enter Y variable");
//        String str_y = user_input_y.next();
        double y = user_input_y.nextDouble();
        System.out.println("The first variable is Y = " + y);

        Scanner user_input_x = new Scanner(System.in);
        System.out.println("Enter X variable");
//        String str_x = user_input_x.next();
        double x = user_input_x.nextDouble();
        System.out.println("The second variable is X = " + x);

        double z = y - x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("Y subtract X is " + z);

    }

    public void divide() {
        Scanner user_input_y = new Scanner(System.in);
        System.out.println("Enter Y variable");
//        String str_y = user_input_y.next();
        double y = user_input_y.nextDouble();
        System.out.println("The first variable is Y = " + y);

        Scanner user_input_x = new Scanner(System.in);
        System.out.println("Enter X variable");
//        String str_x = user_input_x.next();
        double x = user_input_x.nextDouble();
        System.out.println("The second variable is X = " + x);

        double z = y / x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("Y divided by X is " + z);

    }
        public void multiply() {
        Scanner user_input_y = new Scanner(System.in);
        System.out.println("Enter Y variable");
//        String str_y = user_input_y.next();
        double y = user_input_y.nextDouble();
        System.out.println("The first variable is Y = " + y);

        Scanner user_input_x = new Scanner(System.in);
        System.out.println("Enter X variable");
//        String str_x = user_input_x.next();
        double x = user_input_x.nextDouble();
        System.out.println("The second variable is X = " + x);

        double z = y * x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("Y multiplied by X is " + z);

    }
}



