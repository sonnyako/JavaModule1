package com.company;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class FlyEconomyClass implements ICost {
    String passengerName;
    String flightName;
    float ticketCost;
    int luggageWeight;
    float luggageCostPerKg;

    public FlyEconomyClass(String passengerName, String flightName, float ticketCost, int luggageWeight, float luggageCostPerKg) {
        this.passengerName = passengerName;
        this.flightName = flightName;
        this.ticketCost = ticketCost;
        this.luggageWeight = luggageWeight;
        this.luggageCostPerKg = luggageCostPerKg;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public float getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(float ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(int luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public float getLuggageCostPerKg() {
        return luggageCostPerKg;
    }

    public void setLuggageCostPerKg(float luggageCostPerKg) {
        this.luggageCostPerKg = luggageCostPerKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlyEconomyClass)) return false;
        FlyEconomyClass that = (FlyEconomyClass) o;
        return Float.compare(that.ticketCost, ticketCost) == 0 &&
            luggageWeight == that.luggageWeight &&
            Float.compare(that.luggageCostPerKg, luggageCostPerKg) == 0 &&
            Objects.equals(passengerName, that.passengerName) &&
            Objects.equals(flightName, that.flightName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerName, flightName, ticketCost, luggageWeight, luggageCostPerKg);
    }

    @Override
    public float getCost() {
        return this.ticketCost + (this.luggageWeight * this.luggageCostPerKg);
    }

    @Override
    public String toString() {
        return "FlyEconomyClass{"
            + " Passenger name - " + passengerName +
            " Flight name - " + flightName +
            " Ticket cost - " + ticketCost +
            " Luggage weight - " + luggageWeight +
            " Luggage cost/kg - " + luggageCostPerKg;
    }
}
