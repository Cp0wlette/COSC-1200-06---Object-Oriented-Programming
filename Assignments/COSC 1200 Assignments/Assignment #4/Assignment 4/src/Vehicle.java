/*
 * Author: Christian Powlette
 * Due Date: March 28, 2024
 * Professor: Yuvaraj Sambandan
 * Course: COSC-1200-06 Object-Oriented Programming
 * Description of class: Represents a generic vehicle with attributes for make, model, year, and VIN.
 */

// Vehicle class with private attributes and accessor methods
public class Vehicle {
    private String make; // Manufacturer of the vehicle
    private String model; // Model of the vehicle
    private int year; // Year of manufacture
    private String VIN; // Vehicle Identification Number = VIN
    public static final byte VALID_VIN_LENGTH = 17; // Constant for valid VIN length

    // Accessor methods for getting and setting the vehicle's manufacturer
    public String getVehicleMaker() {
        return make;
    }
    public void setVehicleMaker(String make) {
        this.make = make;
    }

    // Accessor methods for getting and setting the vehicle's model
    public String getVehicleModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Accessor methods for getting and setting the vehicle's year
    public int getVehicleYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Accessor methods for getting and setting the vehicle's VIN
    public String getVehicleVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    // Constructor that initializes the attributes using the provided arguments of Vehicle class objects
    public Vehicle(String make, String model, int year, String VIN) {
        setVehicleMaker(make);
        setModel(model);
        setYear(year);
        setVIN(VIN);
    }

    // Method to get formatted vehicle information
    /* This public accessible method returns a String and displays formatted information
     * about the Vehicle class object. The attributes are retrieved using the get() methods,
     * rather than directly accessing the attributes. */
    public String getVehicleInfo() {
        return STR."Make: \{getVehicleMaker()}\nModel: \{getVehicleModel()}\nYear: \{getVehicleYear()}\nVIN: \{getVehicleVIN()}";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Vehicle instance
        Vehicle myCar = new Vehicle("Ford", "Mustang", 2007, "1F4GFDYRXGS324567");

        // Display vehicle information
        System.out.println("Vehicle Information:");
        System.out.println(myCar.getVehicleInfo());
    }

}


