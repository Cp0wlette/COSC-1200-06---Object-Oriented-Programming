/*
 Author: Christian Powlette
 Due  Date: March 28, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class:
 */

// VehicleTester.java

public class VehicleTester {
    public static void main(String[] args) {
        // Create three different vehicle instances
        Vehicle myVehicle = new Vehicle("Ford", "Mustang", 2007, "1F4GFDYRXGS324567");
        Motorcycle myMotorcycle = new Motorcycle("Honda", "Shadow", 2004, "JH2RC040XBM200124", 750, "4 stroke");
        Automobile myAutomobile = new Automobile("Chevy", "Corvette", 1975, "1G4EDYR2XAS123456", 254, "unleaded");

        // Display information for each vehicle
        System.out.println("Vehicle Information:");
        System.out.println(myVehicle.getVehicleInfo());

        System.out.println("\nMotorcycle Information:");
        System.out.println(myMotorcycle.getVehicleInfo());

        System.out.println("\nAutomobile Information:");
        System.out.println(myAutomobile.getVehicleInfo());

        // Create an array of Vehicles
        Vehicle[] vehicles = {myVehicle, myMotorcycle, myAutomobile};

        // Illustrate polymorphism by displaying info using the base class reference
        System.out.println("\nVehicle Information (Polymorphism):");
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleInfo());
        }
    }
}
