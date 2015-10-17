package main.vehicles;

import main.structure.*;

public class Boat extends Vehicle {

    private String name;
    private double gasoline;
    private boolean isRun;

    public Boat(String name, Engine engine, Chassis chassis,  GasTank gasTank) {
        this.engine = engine;
        this.chassis = chassis;
        this.gasTank = gasTank;
        this.name = name;
        gasoline = 0;
        isRun = false;
    }

    @Override
    public void accelerate() {
        isRun = true;
        if (gasoline <= 0)
            brake();
        else{
            System.out.println("Boat accelerate");
            gasoline -= 1;
        }
    }

    @Override
    public void brake() {
        System.out.println("Boat brake");
        isRun = false;
    }

    @Override
    public void turn() {
        System.out.println("Boat Turn...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        if (gasoline >= gasTank.getVolume())
            this.gasoline = gasTank.getVolume();
        this.gasoline = gasoline;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setIsRun(boolean isRun) {
        this.isRun = isRun;
    }
}