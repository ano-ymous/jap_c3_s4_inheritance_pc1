package com.jap.inheritance;

public class EnginesImplementation {
    public static void main(String[] args) {

        Petrol p1000  = new Petrol("P1000",996,50,6000,90,75,3,"11.0:1");
        Petrol p1500  = new Petrol("P1500",1498,88,6500,155,93,4,"10.3:1");
        Petrol p2000  = new Petrol("P2000",1992,118,6500,220,125,4,"12.0:1");
        Petrol p2400 = new Petrol("P2400",2396,138,6900,340,140,6,"10.5:1");

        p1000.showSpecs("Petrol","Fuel");
        p1500.showSpecs("Petrol","Fuel");
        p2000.showSpecs("Petrol","Fuel");
        p2400.showSpecs("Petrol","Fuel");

        Diesel d1300  = new Diesel("D1300",1248,67,6000,200,111,4,"17.6:1");
        Diesel d1800  = new Diesel("D1800",1796,103,6300,170,141,4,"10.5:1");
        Diesel d2400  = new Diesel("D2400",2384,136,7000,233,152,4,"11.2:1");

        d1300.showSpecs("Diesel","Fuel Type");
        d1800.showSpecs("Diesel","Fuel Type");
        d2400.showSpecs("Diesel","Fuel Type");

        CNG c1000 = new CNG("C1000",998,43,6000,78,75,3,"11.0:1");
        CNG c1500  = new CNG("C1500",1498,69,6500,93,141,4,"10.5:1");

        c1000.showSpecs("CNG","Electric Battery");
        c1500.showSpecs("CNG","Electric Battery");

        Electric model1  = new Electric("88",88,15000,220,45,"AC",360);
        model1.showSpecs("Electric","Electric Battery");

    }
}