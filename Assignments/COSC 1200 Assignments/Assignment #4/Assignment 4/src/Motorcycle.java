
/*
 Author: Christian Powlette
 Due  Date: March 28, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class:
 */

// Motorcycle class (inherits from Vehicle)
class Motorcycle extends Vehicle {
    private int engineSize;
    private String engineType;

    // Constructor for Motorcycle class with 6 arguments,
    // consisting of 4 attributes of the grandparent class, and 2 parent class
    public Motorcycle(String make, String model, int year, String VIN, int engineSize, String engineType) {
        super(make, model, year, VIN); // Call parent constructor
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    // Accessor methods for Motorcycle attributes
    public int getEngineSize() {
        return engineSize;
    }

    public String getEngineType() {
        return engineType;
    }

    // Override grandfather getVehicleInfo() method to display new Motorcycle class info
    @Override
    public String getVehicleInfo() {
        // Call parent's getVehicleInfo() and append motorcycle-specific info
        return STR."\{super.getVehicleInfo()}\nEngine Size: \{engineSize} cc\nEngine Type: \{engineType}";
    }

    // Main method for testing displaying upper and current class attribute information
    public static void main(String[] args) {
        // Create a Motorcycle instance
        Motorcycle myMotorcycle = new Motorcycle("Honda", "Shadow", 2004, "JH2RC040XBM200124", 750, "4 stroke");

        // Display vehicle information
        System.out.println("Motorcycle Information:");
        System.out.println(myMotorcycle.getVehicleInfo());
    }
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

}
