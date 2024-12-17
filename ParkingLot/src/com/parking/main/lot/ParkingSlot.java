package com.parking.main.lot;

import com.parking.main.models.Vehicle;
import com.parking.main.models.VehicleTypes;

public abstract class ParkingSlot {
    int id ;
    boolean isFree ;
    Vehicle vehicle ;
    VehicleTypes vehicleType ;

    public ParkingSlot(int id) {
        this.vehicle = null;
        this.isFree = true;
        this.id = id;
    }

    public ParkingSlot(int id , VehicleTypes vt){
        this.id = id ;
        this.isFree  = true ;
        this.vehicleType = vt ;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public VehicleTypes getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypes vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void unparkVehicle(){
        vehicle = null ;
        isFree = true ;
        return ;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
