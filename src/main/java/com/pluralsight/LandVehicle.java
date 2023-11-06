package com.pluralsight;

public class Ground extends Vehicle {
    String moped;
    int numberOfTires;

    public Ground(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isPublic) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, isPublic);
    }
}
