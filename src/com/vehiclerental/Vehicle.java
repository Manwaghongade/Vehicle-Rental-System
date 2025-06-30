package com.vehiclerental;

public abstract class Vehicle {
    protected String vehicleId;
    protected String model;
    protected double rentPerDay;

    public Vehicle(String vehicleId, String model, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    public double calculateRent(int days) {
        return days * rentPerDay;
    }

    public String getDetails() {
        return vehicleId + " - " + model + " (" + rentPerDay + "/day)";
    }
}