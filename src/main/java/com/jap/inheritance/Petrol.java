package com.jap.inheritance;

public class Petrol extends Engines{
    public int displacement;
    public int cylinders;
    String compRatio;

    public Petrol(String model,int maxPower, int maxRPM, int maxTorque, int weight, int displacement, int cylinders, String compRatio) {
        super(maxPower, maxRPM, maxTorque, weight);
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
