package com.vrk.parkinglot.parkingspot.manager;

import com.vrk.parkinglot.parkingspot.ParkingSpot;
import com.vrk.parkinglot.parkingspot.strategy.ParkingSpotStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    public TwoWheelerParkingSpotManager( ParkingSpotStrategy parkingSpotStrategy) {
        super(parkingSpotStrategy);
    }
}
