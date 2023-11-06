package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        AerialVehicle helicopter = new AerialVehicle();
        helicopter.setHoverType(true);
        helicopter.setPublic(true);
        AquaMarine sub = new AquaMarine();
        sub.setBelowWater(true);

    }
}
