package Driving;

public abstract class Car implements Drivable {
    public abstract Boolean needsOilChange();
    public abstract void changeOil();
    public abstract Boolean checkEngineLight();
    public abstract Double getDistanceTraveled();
}
