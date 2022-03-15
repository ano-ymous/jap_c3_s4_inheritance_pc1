package com.jap.inheritance;

public class CNG extends Engines{
    public int displacement;
    public int cylinders;
    int[] maxPowervalues = {43,69};
    int[] maxRPMvalues = {6000,6500};
    int[] maxTorquevalues = {78,122};
    int[] weightvalues = {75,93};
    float[] compRatiovalues = {11.0f,10.5f};
    int[] displacementValues = {998,1498};
    int[] cylinderValues = {3,4};
    public CNG(String model) {
        int type = -1;
        if(model.equals("C1000")) type = 0;
        else if(model.equals("C1500")) type = 1;
        super.model = model;
        super.maxPower = maxPowervalues[type];
        super.maxRPM = maxRPMvalues[type];
        super.maxTorque = maxTorquevalues[type];
        super.compRatio = compRatiovalues[type];
        super.weight = weightvalues[type];
        this.displacement = displacementValues[type];
        this.cylinders = cylinderValues[type];
    }

    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }
}
