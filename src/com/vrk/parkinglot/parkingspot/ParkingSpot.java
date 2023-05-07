package com.vrk.parkinglot.parkingspot;

import com.vrk.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
     int id;
    boolean isEmpty;
    Vehicle vehicle;
    double price=0;



    public ParkingSpot(int id) {
        this.id = id;
    }

    public abstract double price();

    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void removeVehicle(){
        this.vehicle=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", isEmpty=" + isEmpty +
                ", vehicle=" + vehicle +
                ", price=" + price +
                '}';
    }
}
