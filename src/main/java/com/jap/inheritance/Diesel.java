package com.jap.inheritance;

public class Diesel extends Engines{
    public int displacement;
    public int cylinders;
    public String compRatio;


    public Diesel(String model, int maxPower, int maxRPM, int maxTorque, int weight, int displacement, int cylinders, String compRatio) {
        super(model, maxPower, maxRPM, maxTorque, weight);
        this.displacement = displacement;
        this.cylinders = cylinders;
        this.compRatio = compRatio;
    }

    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }
}
