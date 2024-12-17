package com.parking.main.models;

public class Ticket {
    String id ;
    Vehicle v ;
    int lotId ;
    int floor ;

    public Ticket(String id, Vehicle v, int lotId, int floor) {
        this.id = id;
        this.v = v;
        this.lotId = lotId;
        this.floor = floor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
