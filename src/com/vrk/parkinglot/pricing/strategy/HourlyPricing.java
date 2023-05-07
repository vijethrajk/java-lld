package com.vrk.parkinglot.pricing.strategy;

import com.vrk.parkinglot.ticket.Ticket;

import java.util.Random;

public class HourlyPricing extends PricingStrategy{
    public HourlyPricing() {
    }
    @Override
    public double price(Ticket ticket){
        return new Random().nextDouble(); // implement valid logic
    }
}
