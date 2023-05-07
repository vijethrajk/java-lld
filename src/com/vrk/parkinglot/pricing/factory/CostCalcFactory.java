package com.vrk.parkinglot.pricing.factory;

import com.vrk.parkinglot.pricing.CostCalculator;
import com.vrk.parkinglot.pricing.FourWheelerCost;
import com.vrk.parkinglot.pricing.TwoWheelerCost;
import com.vrk.parkinglot.vehicle.VehicleType;

public class CostCalcFactory {

    public static CostCalculator costCalculator(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER:
                return new TwoWheelerCost();
            case FOUR_WHEELER:
                return new FourWheelerCost();
            default: return null;
        }
    }
}
