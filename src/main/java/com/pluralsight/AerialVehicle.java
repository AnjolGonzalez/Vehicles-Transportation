package com.pluralsight;

public class AerialVehicle extends Vehicle{

    private boolean isHoverType = false;
    private boolean isFlyType = false;
    private boolean isHybrid = false;

    public boolean isHoverType() {
        return isHoverType;
    }

    public void setHoverType(boolean hoverType) {
        isHoverType = hoverType;
    }

    public boolean isFlyType() {
        return isFlyType;
    }

    public void setFlyType(boolean flyType) {
        isFlyType = flyType;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }
}
