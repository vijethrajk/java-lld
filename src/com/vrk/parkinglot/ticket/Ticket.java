package com.vrk.parkinglot.ticket;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    private  LocalDateTime localDateTime;
    private  Vehicle vehicle;
    private  ParkingSpot parkingSpot;

    public Ticket() {
    }

    public Ticket(LocalDateTime localDateTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.localDateTime = localDateTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
