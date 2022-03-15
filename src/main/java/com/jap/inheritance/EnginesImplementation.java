package com.jap.inheritance;

public class EnginesImplementation {
    public static void main(String[] args) {

        Petrol p1000  = new Petrol("P1000");
        Petrol p1500  = new Petrol("P1500");
        Petrol p2000  = new Petrol("P2000");
        Petrol p2400 = new Petrol("P2400");

        p1000.showSpecs("Petrol","Fuel");
        p1500.showSpecs("Petrol","Fuel");
        p2000.showSpecs("Petrol","Fuel");
        p2400.showSpecs("Petrol","Fuel");

        Diesel d1300  = new Diesel("D1300");
        Diesel d1800  = new Diesel("D1800");
        Diesel d2400  = new Diesel("D2400");

        d1300.showSpecs("Diesel","Fuel Type");
        d1800.showSpecs("Diesel","Fuel Type");
        d2400.showSpecs("Diesel","Fuel Type");

        CNG c1000 = new CNG("C1000");
        CNG c1500  = new CNG("C1500");

        c1000.showSpecs("CNG","Electric Battery");
        c1500.showSpecs("CNG","Electric Battery");

        Electric model1  = new Electric("88");
        model1.showSpecs("Electric","Electric Battery");

    }
}