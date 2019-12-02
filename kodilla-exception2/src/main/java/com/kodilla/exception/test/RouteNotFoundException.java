package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(Flight flight) {
        super(flight + " not found.");
    }
}