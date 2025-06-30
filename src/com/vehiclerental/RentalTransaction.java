package com.vehiclerental;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public void printReceipt() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getDetails());
        System.out.println("Days: " + days);
        System.out.println("Total Rent: Rs. " + vehicle.calculateRent(days));
    }
}