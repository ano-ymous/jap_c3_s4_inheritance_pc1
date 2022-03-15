package com.jap.inheritance;

public class Electric extends Engines{
    public String currentType;
    public int voltage;

    public Electric(String model) {
        super.compRatio = -1;
        super.model = model;
        super.maxPower = 88;
        super.maxTorque = 220;
        super.weight = 45;
        super.maxRPM = 15000;
        this.currentType = "AC";
        this.voltage = 360;
    }

    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }

}