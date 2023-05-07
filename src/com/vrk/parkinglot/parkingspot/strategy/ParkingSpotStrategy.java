package com.vrk.parkinglot.parkingspot.strategy;

import com.vrk.parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public interface ParkingSpotStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}
