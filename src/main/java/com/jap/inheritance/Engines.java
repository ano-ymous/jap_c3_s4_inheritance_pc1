package com.jap.inheritance;

public class Engines {
    protected String model;
    protected int maxPower;
    protected int maxRPM;
    protected int maxTorque;
    protected int weight;

    public Engines(String model,int maxPower, int maxRPM, int maxTorque, int weight) {

        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
        this.maxTorque = maxTorque;
        this.weight = weight;
    }


}