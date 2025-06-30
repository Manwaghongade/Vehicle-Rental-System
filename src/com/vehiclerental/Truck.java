package com.vehiclerental;

public class Truck extends Vehicle {
    private double capacityInTons;

    public Truck(String vehicleId, String model, double capacityInTons) {
        super(vehicleId, model, 1500.0); // System-defined rent
        this.capacityInTons = capacityInTons;
    }
}