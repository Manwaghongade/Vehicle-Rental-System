package com.vehiclerental;

public class Bike extends Vehicle {
    private String type;

    public Bike(String vehicleId, String model, String type) {
        super(vehicleId, model, 500.0); // System-defined rent
        this.type = type;
    }
}