package com.vrk.parkinglot.pricing;

import com.vrk.parkinglot.pricing.strategy.PricingStrategy;
import com.vrk.parkinglot.ticket.Ticket;

public class CostCalculator {
    PricingStrategy pricingStrategy;

    public CostCalculator(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;

    }

    public double calculatePrice(Ticket ticket){
       return pricingStrategy.price(ticket);
    }
}
