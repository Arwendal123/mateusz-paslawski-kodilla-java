package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {

    Map<String, Boolean> airportMap = new HashMap<>();

    {

        airportMap.put("Airport1", true);
        airportMap.put("Airport2", true);
        airportMap.put("Airport3", false);
        airportMap.put("Airport4", false);
    }

    public Map<String, Boolean> getMap(){
        return airportMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flight == null) {
            throw new IllegalArgumentException();
        }

        if (airportMap.containsKey(flight.getArrivalAirport())) {
            return airportMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException(flight);
        }

    }
}
