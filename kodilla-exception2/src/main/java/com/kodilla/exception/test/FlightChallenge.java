package com.kodilla.exception.test;

import java.util.HashSet;
import java.util.Set;

public class FlightChallenge {
    public static void main(String[] args) {

        FlightMap flightMap = new FlightMap();
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Departure Airport", "Airport1"));
        flights.add(new Flight("Departure Airport", "Airport2"));
        flights.add(new Flight("Departure Airport", "Airport3"));
        flights.add(new Flight("Departure Airport", "Airport4"));
        flights.add(new Flight("Departure Airport", "Airport5"));

        for (Flight flight : flights) {
            try {
                System.out.println(flightMap.findFlight(flight));
            } catch (RouteNotFoundException r){
                System.out.println("ERROR");
            }
        }
    }
}
