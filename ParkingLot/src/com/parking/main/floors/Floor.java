package com.parking.main.floors;

import com.parking.main.lot.ParkingSlot;
import com.parking.main.models.Vehicle;
import com.parking.main.models.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int sno ;
    List<ParkingSlot> slots ;
    int lotSize ;

    public Floor(int sno, int lotSize) {
        this.sno = sno;
        this.lotSize = lotSize;
        this.slots = new ArrayList<>(lotSize);

        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;

        int numBikes = (int) (lotSize * spotsForBikes);
        int numCars = (int) (lotSize * spotsForCars);

        for (int i = 1; i <= numBikes; i++) {
            slots.add(new ParkingSlot(i, VehicleTypes.LIGHT) {
            });
        }
        for (int i = numBikes + 1; i <= numBikes + numCars; i++) {
            slots.add(new ParkingSlot(i,VehicleTypes.CARS){});
        }
        for (int i = numBikes + numCars + 1; i <= lotSize; i++) {
            slots.add(new ParkingSlot(i,VehicleTypes.HEAVY){});
        }
    }

    public long getCountOfFreeSlots(VehicleTypes vehicleType){
        return slots.stream().filter(slot-> slot.isFree() && slot.getVehicleType().equals(vehicleType)).count();
    }

    public String getFreeSlots(VehicleTypes vehicleType){
        StringBuilder freeSlots = new StringBuilder();
        for (ParkingSlot slot : slots) {
            if (slot.isFree() && slot.getVehicleType().equals(vehicleType)) {
                freeSlots.append(slot.getId());
            }
        }
        return freeSlots.toString();
    }

    public Boolean parkVehicle(Vehicle v){
        for(ParkingSlot s : slots){
            if(s.isAvailable() && v.getType().equals(s.getVehicleType())){
                return true ;
            }
        }
        return false ;
    }

    public Boolean unparkVehicle(Vehicle v){
        for(ParkingSlot s : slots){
            if(!s.isAvailable() && v.getRegNo().equals(s.getVehicle().getRegNo())){
                s.unparkVehicle();
                return true ;
            }
        }
        return false ;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
