package com.parking.main.lot;

import com.parking.main.models.Vehicle;

import java.util.Random;

public class LightVehicleSlot extends ParkingSlot{
    Vehicle v ;

    public LightVehicleSlot(Vehicle v) {
        super(new Random().nextInt()+1);
        this.v = v;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }
}
