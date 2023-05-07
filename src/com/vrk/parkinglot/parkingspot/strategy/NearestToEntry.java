package com.vrk.parkinglot.parkingspot.strategy;

import com.vrk.parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public class NearestToEntry implements ParkingSpotStrategy{

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.get(0);
    }
}
