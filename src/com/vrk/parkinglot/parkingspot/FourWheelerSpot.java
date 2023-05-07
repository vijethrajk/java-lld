package com.vrk.parkinglot.parkingspot;

public class FourWheelerSpot extends ParkingSpot {
    public FourWheelerSpot(int id) {
        super(id);
    }

    @Override
    public double price() {
        return 20;
    }
}
