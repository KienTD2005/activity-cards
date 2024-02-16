package org.sample.java.inheritance;

public abstract class SportUtilityVehicle extends LandCraft{
    protected boolean isOffRoad;
    protected static int numberOfSeats;

    public boolean OffRoad() {
        return isOffRoad;
    }
    public int numberOfSeats() {
        return numberOfSeats;
    }
}
