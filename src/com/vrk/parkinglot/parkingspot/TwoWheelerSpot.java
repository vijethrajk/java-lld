package com.vrk.parkinglot.parkingspot;

public class TwoWheelerSpot extends ParkingSpot{
    public TwoWheelerSpot(int id) {
        super(id);
    }

    @Override
    public double price() {
        return 10;
    }
}
