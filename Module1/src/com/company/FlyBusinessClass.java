package com.company;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class FlyBusinessClass implements ICost {
    String passengerName;
    String flightName;
    float ticketCost;

    public FlyBusinessClass(String passengerName, String flightName, float ticketCost) {
        this.passengerName = passengerName;
        this.flightName = flightName;
        this.ticketCost = ticketCost;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlyBusinessClass)) return false;
        FlyBusinessClass that = (FlyBusinessClass) o;
        return Float.compare(that.ticketCost, ticketCost) == 0 &&
            Objects.equals(passengerName, that.passengerName) &&
            Objects.equals(flightName, that.flightName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerName, flightName, ticketCost);
    }

    @Override
    public float getCost() {
        return this.ticketCost;
    }

    @Override
    public String toString() {
        return "Business Class {" +
            " Passenger name - " + passengerName +
            " Flight name - " + flightName +
            " Ticket cost - " + ticketCost;
    }
}