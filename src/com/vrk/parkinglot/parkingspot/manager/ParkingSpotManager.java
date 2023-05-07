package com.vrk.parkinglot.parkingspot.manager;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;
import com.vrk.parkinglot.ticket.Ticket;
import com.vrk.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    ParkingSpotStrategy parkingSpotStrategy;

    public ParkingSpotManager( ParkingSpotStrategy parkingSpotStrategy) {
        this.parkingSpotList = new ArrayList<>();
        this.parkingSpotStrategy = parkingSpotStrategy;
    }

    public ParkingSpot findParkingSpace() {
        return parkingSpotStrategy.findParkingSpot(this.parkingSpotList);
    }

    public void addParkingSpace(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public ParkingSpot removeParkingSpace(Ticket ticket) {
        parkingSpotList.stream().filter(e-> e.getId()==ticket.getParkingSpot().getId()).map(m-> {
            m.removeVehicle();
            return m;
        }).collect(Collectors.toList());
        return ticket.getParkingSpot();
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
