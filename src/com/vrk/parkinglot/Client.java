package com.vrk.parkinglot;

import com.vrk.parkinglot.entry.EntryGate;
import com.vrk.parkinglot.exit.ExitGate;
import com.vrk.parkinglot.parkingspot.FourWheelerSpot;
import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.TwoWheelerSpot;
import com.vrk.parkinglot.parkingspot.factory.ParkingSpotFactory;
import com.vrk.parkinglot.parkingspot.manager.ParkingSpotManager;
import com.vrk.parkinglot.parkingspot.strategy.NearestToEntry;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;
import com.vrk.parkinglot.ticket.Ticket;
import com.vrk.parkinglot.vehicle.Vehicle;
import com.vrk.parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        ParkingSpot t1 = new TwoWheelerSpot(1);
        ParkingSpot t2 = new TwoWheelerSpot(2);

        ParkingSpot f1 = new FourWheelerSpot(3);
        ParkingSpot f2 = new FourWheelerSpot(4);

        ParkingSpotStrategy parkingSpotStrategy = new NearestToEntry();

        //Adding parking space to Two Wheelers
        ParkingSpotManager parkingSpotManagerTW = ParkingSpotFactory.getParkingSpotManager(VehicleType.TWO_WHEELER, parkingSpotStrategy);
        parkingSpotManagerTW.addParkingSpace(t1);
        parkingSpotManagerTW.addParkingSpace(t2);

        //Adding parking space to Four Wheelers
        ParkingSpotManager parkingSpotManagerFW = ParkingSpotFactory.getParkingSpotManager(VehicleType.TWO_WHEELER, parkingSpotStrategy);
        parkingSpotManagerFW.addParkingSpace(f1);
        parkingSpotManagerFW.addParkingSpace(f2);


        //Entry gate operations
        Vehicle vehicle = new Vehicle(123, VehicleType.TWO_WHEELER);

        //parking strategy can also be decided inside Entry gate as well, than taking from parking spot manager
        EntryGate entryGate = new EntryGate(vehicle, parkingSpotManagerTW);
        Ticket ticket = entryGate.bookSpot();

        //Exit Gate operations
        ExitGate exitGate = new ExitGate(vehicle, ticket, parkingSpotManagerTW);
        exitGate.calculatePrice();
        exitGate.freeParkingSpot(parkingSpotStrategy);


    }
}
