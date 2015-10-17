package main;

import main.structure.*;
import main.vehicles.Boat;
import main.vehicles.Car;
import main.vehicles.SolarCar;

public class HomeTasks2 {
    public static void main(String[] args) {
        Car car = new Car("BMW",
                new Engine("V12", SourceOfEnergy.AC_SYNCHRONOS, DeviceCombustionEngines.INTERNAL),
                new Chassis("Wheels"),
                new GasTank("Bak", 30));
        car.setGasoline(30);
        car.accelerate();
        car.turn();
        car.brake();

        SolarCar solarCar = new SolarCar("Solar Machine",
                new Engine("Tohatsu M2.5A2 S", SourceOfEnergy.AC_SYNCHRONOS, DeviceCombustionEngines.INTERNAL),
                new Chassis("Screw"),
                new GasTank("In engine", 30));
        solarCar.setGasoline(10);
        solarCar.accelerate();
        solarCar.turn();
        solarCar.brake();

        Boat boat = new Boat("Galia 525 cruiser",
                new Engine("Battery", SourceOfEnergy.SOLAR, DeviceCombustionEngines.INTERNAL),
                new Chassis("Wheels"),
                new GasTank("Bak", 30));
        boat.setGasoline(10);
        boat.accelerate();
        boat.turn();
        boat.brake();
    }
}