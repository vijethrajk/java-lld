package com.vrk.parkinglot.pricing;

import com.vrk.parkinglot.pricing.strategy.PerMinPricing;
import com.vrk.parkinglot.pricing.strategy.PricingStrategy;

public class FourWheelerCost extends CostCalculator{
    public FourWheelerCost() {
        super(new PerMinPricing());
    }
}
