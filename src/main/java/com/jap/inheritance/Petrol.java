package com.jap.inheritance;

public class Petrol extends Engines{
    public int displacement;
    public int cylinders;
    int[] maxPowervalues = {50,88,118,138};
    int[] maxRPMvalues = {6000,6500,6500,6900};
    int[] maxTorquevalues = {90,155,220,340};
    int[] weightvalues = {75,93,125,140};
    int[] clylindersValues = {3,4,4,6};
    float[] compRatiovalues = {11.0f,10.3f,12.0f,10.5f};
    int[] displacementValues = {996,1496,1992,2396};
    public Petrol(String model) {
        int type = -1;
        if(model.equals("P1000")) type = 0;
        else if(model.equals("P1500")) type = 1;
        else if(model.equals("P2000")) type = 2;
        else if(model.equals("P2400")) type = 3;

        super.model = model;
        super.compRatio = compRatiovalues[type];
        super.maxPower = maxPowervalues[type];
        super.maxTorque = maxTorquevalues[type];
        super.weight = weightvalues[type];
        this.displacement = displacementValues[type];
        this.cylinders = clylindersValues[type];
    }



    public void showSpecs(String EngineType,String PowerSource){
        System.out.println("Engine Type: "+EngineType);
        System.out.println("Power Source: "+PowerSource);
        System.out.println("Model Number: "+model);
        System.out.println();

    }

}
