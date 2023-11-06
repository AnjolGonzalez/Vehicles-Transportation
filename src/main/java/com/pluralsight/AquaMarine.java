package com.pluralsight;

public class AquaMarine extends Vehicle{

    public AquaMarine() {
        super();
        this.aboveWater = aboveWater;
        this.belowWater = belowWater;
    }

    private boolean aboveWater;
    private boolean belowWater;

    public boolean isAboveWater() {
        return aboveWater;
    }

    public void setAboveWater(boolean aboveWater) {
        this.aboveWater = aboveWater;
    }

    public boolean isBelowWater() {
        return belowWater;
    }

    public void setBelowWater(boolean belowWater) {
        this.belowWater = belowWater;
    }
}
