package com.vrk.parkinglot.pricing;

import com.vrk.parkinglot.pricing.strategy.HourlyPricing;
import com.vrk.parkinglot.pricing.strategy.PricingStrategy;

public class TwoWheelerCost extends CostCalculator{
    public TwoWheelerCost() {
        super(new HourlyPricing());
    }
}
