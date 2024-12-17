package com.parking.main.models;

public class Vehicle {
    String regNo ;
    String color ;
    VehicleTypes type ;

    public Vehicle(String color, String regNo, VehicleTypes type) {
        this.color = color;
        this.regNo = regNo;
        this.type = type;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleTypes getType() {
        return type;
    }

    public void setType(VehicleTypes type) {
        this.type = type;
    }
}

