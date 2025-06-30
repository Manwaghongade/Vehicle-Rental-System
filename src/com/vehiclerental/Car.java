package com.vehiclerental;

public class Car extends Vehicle {
    private int seatCount;

    public Car(String vehicleId, String model, int seatCount) {
        super(vehicleId, model, 1000.0); // System-defined rent
        this.seatCount = seatCount;
    }
}