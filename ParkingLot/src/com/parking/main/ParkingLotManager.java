package com.parking.main;

import com.parking.main.display.DisplayTypes;
import com.parking.main.floors.Floor;
import com.parking.main.models.Ticket;
import com.parking.main.models.Vehicle;
import com.parking.main.models.VehicleTypes;

import java.util.List;

public class ParkingLotManager {
    List<Floor> floors ;
    Ticket ticket ;
    Vehicle vehicle ;

    public ParkingLotManager(Ticket t) {
        this.ticket = t;
        this.vehicle = t.getV() ;
    }

    public void createFloor(int noOfFloors , int lotSize){
        for(int i=0 ; i<noOfFloors ; i++){
            Floor floor = new Floor(floors.size()+1 , lotSize);
            floors.add(floor);
        }
        System.out.println("Created parking lot with "+noOfFloors+" floors and "+lotSize+" slots per floor");
    }

    public void display(DisplayTypes displayTypes  , VehicleTypes vehicleType){
        if(displayTypes.equals(DisplayTypes.FREE_COUNT)){
            for(Floor f : floors){
               System.out.println( "No. of free slots for "+ vehicleType.toString()  +" on Floor " +f.getSno()+ " : "+f.getCountOfFreeSlots(vehicleType));
            }
        }else if(displayTypes.equals(DisplayTypes.FREE_SLOTS)){
            for(Floor f : floors){
                System.out.println( "No. of free slots for "+ vehicleType.toString()  +" on Floor " +f.getSno()+ " : "+f.getFreeSlots(vehicleType));
            }
        }else{
            //Occupied
        }
    }
}
