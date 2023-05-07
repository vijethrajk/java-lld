package com.vrk.parkinglot.pricing.strategy;

import com.vrk.parkinglot.ticket.Ticket;

import java.util.Random;

public class PerMinPricing extends PricingStrategy{
    public PerMinPricing() {

    }
    @Override
    public double price(Ticket ticket){
        return new Random().nextDouble(); // implement valid logic
    }
}
