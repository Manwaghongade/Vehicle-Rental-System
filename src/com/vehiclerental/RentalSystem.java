package com.vehiclerental;

import java.util.*;

public class RentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        String customerId = UUID.randomUUID().toString().substring(0, 5);
        Customer customer = new Customer(customerId, name);

        List<Vehicle> vehicles = Arrays.asList(
                new Car("C101", "Swift Dzire", 5),
                new Bike("B202", "Pulsar NS", "Sport"),
                new Truck("T303", "Tata Ace", 3.5)
        );

        System.out.println("Available Vehicles:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i).getDetails());
        }

        System.out.print("Choose Vehicle (1-" + vehicles.size() + "): ");
        int choice = scanner.nextInt();

        System.out.print("Enter number of rental days: ");
        int days = scanner.nextInt();

        Vehicle selectedVehicle = vehicles.get(choice - 1);
        RentalTransaction transaction = new RentalTransaction(customer, selectedVehicle, days);

        System.out.println("\n--- Rental Receipt ---");
        transaction.printReceipt();
    }
}