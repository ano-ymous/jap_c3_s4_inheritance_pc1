package com.jap.inheritance;

public class Diesel extends Engines{
    public int displacement;
    public int cylinders;
    int[] maxPowervalues = {67,103,136};
    int[] maxRPMvalues = {6000,6300,7000};
    int[] maxTorquevalues = {200,170,233};
    int[] weightvalues = {111,141,152};
    float[] compRatiovalues = {17.6f,10.5f,11.2f};
    int[] displacementValues = {1248,1796,2384};

    public Diesel(String model) {
        int type = -1;
        if(model.equals("D1300")) type = 0;
        else if(model.equals("D1800")) type = 1;
        else if(model.equals("D2400")) type = 2;
        super.model = model;
        super.maxPower = maxPowervalues[type];
        super.maxRPM = maxRPMvalues[type];
        super.maxTorque = maxTorquevalues[type];
        super.compRatio = compRatiovalues[type];
        super.weight = weightvalues[type];
        this.displacement = displacementValues[type];
        this.cylinders = 4;
    }

    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }
}
