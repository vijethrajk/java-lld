package com.vrk.parkinglot.pricing.strategy;

import com.vrk.parkinglot.ticket.Ticket;

public abstract class PricingStrategy {

    public  PricingStrategy(){

    }
    public  double price(Ticket ticket){
        return 20;//default fixed price
    }
}
