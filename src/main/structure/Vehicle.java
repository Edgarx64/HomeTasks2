package main.structure;

public abstract class Vehicle {
    protected Engine engine;
    protected Chassis chassis;
    protected GasTank gasTank;

    abstract protected void accelerate();
    abstract protected void brake();
    abstract protected void turn();
}
