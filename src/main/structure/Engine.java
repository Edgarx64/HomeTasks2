package main.structure;

public class Engine {
    private String name;
    private SourceOfEnergy sourceOfEnergy;
    private DeviceCombustionEngines deviceCombustionEngines;

    public Engine(String name, SourceOfEnergy sourceOfEnergy, DeviceCombustionEngines deviceCombustionEngines) {
        this.name = name;
        this.sourceOfEnergy = sourceOfEnergy;
        this.deviceCombustionEngines = deviceCombustionEngines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceOfEnergy getSourceOfEnergy() {
        return sourceOfEnergy;
    }

    public void setSourceOfEnergy(SourceOfEnergy sourceOfEnergy) {
        this.sourceOfEnergy = sourceOfEnergy;
    }

    public DeviceCombustionEngines getDeviceCombustionEngines() {
        return deviceCombustionEngines;
    }

    public void setDeviceCombustionEngines(DeviceCombustionEngines deviceCombustionEngines) {
        this.deviceCombustionEngines = deviceCombustionEngines;
    }
}
