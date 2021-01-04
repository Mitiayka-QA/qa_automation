package com.automation.issoft.random;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Calcv1 {

    double previousResult;

    public void sum (double y, double x){
        double z = y + x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("New result is " + z);

    }

    public void subtract (double y, double x){
        double z = y - x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("New result is " + z);

    }

    public void divide (double y, double x){
        double z = y / x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("New result is " + z);

    }

    public void multiply (double y, double x){
        double z = y * x;
        System.out.println("Previous result is " + previousResult);
        previousResult = z;
        System.out.println("New result is " + z);

    }
}
