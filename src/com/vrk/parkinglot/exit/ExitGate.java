package com.vrk.parkinglot.exit;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.factory.ParkingSpotFactory;
import com.vrk.parkinglot.parkingspot.manager.ParkingSpotManager;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;
import com.vrk.parkinglot.pricing.CostCalculator;
import com.vrk.parkinglot.pricing.factory.CostCalcFactory;
import com.vrk.parkinglot.ticket.Ticket;
import com.vrk.parkinglot.vehicle.Vehicle;

import java.util.List;

public class ExitGate {
    final Vehicle vehicle;
    final Ticket ticket;

    ParkingSpotManager parkingSpotManager;
    public ExitGate(Vehicle vehicle, Ticket ticket,ParkingSpotManager parkingSpotManager) {
        this.vehicle = vehicle;
        this.ticket = ticket;
        this.parkingSpotManager=parkingSpotManager;
    }

    public double calculatePrice() {
        System.out.println("Calculating price  ");
        CostCalculator costCalculator = CostCalcFactory.costCalculator(this.vehicle.getVehicleType());
        double price = costCalculator.calculatePrice(this.ticket);
        System.out.println("Total amount Payable : " + price);
        return price;

    }

    public void freeParkingSpot( ParkingSpotStrategy parkingSpotStrategy) {
       // ParkingSpotManager parkingSpotManager = ParkingSpotFactory.getParkingSpotManager(this.vehicle.getVehicleType(),  parkingSpotStrategy);
        ParkingSpot parkingSpot=this.parkingSpotManager.removeParkingSpace(this.ticket);
        System.out.println("Clearing spot :"+parkingSpot);

    }


}
