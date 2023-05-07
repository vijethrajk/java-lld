package com.vrk.parkinglot.entry;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.factory.ParkingSpotFactory;
import com.vrk.parkinglot.parkingspot.manager.ParkingSpotManager;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;
import com.vrk.parkinglot.ticket.Ticket;
import com.vrk.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

public class EntryGate {
    final ParkingSpotManager parkingSpotManager;
    final Vehicle vehicle;
    public EntryGate(Vehicle vehicle, ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager = parkingSpotManager;
        this.vehicle=vehicle;
    }

    private ParkingSpot findParkingSpace(){
       // parkingSpotManager =
        ParkingSpot parkingSpot=  parkingSpotManager.findParkingSpace();
        System.out.println(" Available Spot : "+parkingSpot);
        return  parkingSpot;
    }
    public Ticket bookSpot(){
        ParkingSpot parkingSpot = this.findParkingSpace();
        parkingSpotManager.parkVehicle(this.vehicle,parkingSpot);
        System.out.println("Spot is reserved : "+parkingSpot);
        return this.generateTicket(parkingSpot);
    }

    private Ticket generateTicket(ParkingSpot parkingSpot){
        return new Ticket(LocalDateTime.now(),this.vehicle,parkingSpot);
    }

}
