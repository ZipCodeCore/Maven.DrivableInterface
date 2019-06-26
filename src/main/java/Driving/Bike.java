package Driving;

public abstract class Bike implements Drivable {
    public abstract Integer getTirePressure();
    public abstract void inflateTires();
    public abstract Integer reccommendedTirePressure();
}
