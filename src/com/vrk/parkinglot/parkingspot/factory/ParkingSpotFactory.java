package com.vrk.parkinglot.parkingspot.factory;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.manager.FourWheelerParkingSpotManager;
import com.vrk.parkinglot.parkingspot.manager.ParkingSpotManager;
import com.vrk.parkinglot.parkingspot.manager.TwoWheelerParkingSpotManager;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;
import com.vrk.parkinglot.vehicle.VehicleType;

import java.util.List;

public class ParkingSpotFactory {
    private ParkingSpotFactory(){}

    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType,  ParkingSpotStrategy parkingSpotStrategy){
        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager(parkingSpotStrategy);
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManager(parkingSpotStrategy);
            default:
                return null;
        }
    }
}
