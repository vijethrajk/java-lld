package com.vrk.parkinglot.vehicle;

public class Vehicle {
    int vehicleNum;
    VehicleType vehicleType;

    public Vehicle(int vehicleNum, VehicleType vehicleType) {
        this.vehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNum=" + vehicleNum +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
