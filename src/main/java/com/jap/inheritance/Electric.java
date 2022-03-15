package com.jap.inheritance;

public class Electric extends Engines{
    public String currentType;
    public int voltage;

    public Electric(String model, int maxPower, int maxRPM, int maxTorque, int weight, String currentType, int voltage) {
        super(model, maxPower, maxRPM, maxTorque, weight);
        this.currentType = currentType;
        this.voltage = voltage;
    }

    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }

}