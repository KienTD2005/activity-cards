package org.sample.java.inheritance;

import java.awt.*;
public class Jeep extends SportUtilityVehicle {

    private Color color;
    protected double gasMileage;
    private double towingCapacity;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        this.gasMileage = gasMileage;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }


    public int getNumberOfSeats() {
        return numberOfSeats + 1;
    }
}
