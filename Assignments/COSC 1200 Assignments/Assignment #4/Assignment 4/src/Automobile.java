/*
 * Author: Christian Powlette
 * Due Date: March 28, 2024
 * Professor: Yuvaraj Sambandan
 * Course: COSC-1200-06 Object-Oriented Programming
 * Description of class: Represents an automobile with additional attributes for horsepower and fuel type.
 */
public class Automobile extends Vehicle {
    private int horsepower; // Horsepower attribute of the automobile class
    private String fuelType; // Type of fuel attribute used by the automobile class

    // Constructor with 6 arguments (4 parent class attributes, 2 new ones in derived class)
    public Automobile(String make, String model, int year, String VIN, int horsepower, String fuelType) {
        super(make, model, year, VIN); // Call parent constructor
        setHorsepower(horsepower);
        setFuelType(fuelType);
    }

    // Accessor methods for horsepower
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Accessor methods for fuelType
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Override getVehicleInfo() of the parent / super class to display derived class, Automobile, info
    @Override
    public String getVehicleInfo() {
        return STR."\{super.getVehicleInfo()}\nHorsepower: \{getHorsepower()}\nFuel Type: \{getFuelType()}";
    }
}
