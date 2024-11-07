/*
 Author: Christian Powlette
 Due  Date: February 16, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: A program that calculates the Celsius value when Fahrenheit input is given.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        //DECLARATIONS
        double Fahrenheit = 0; //
        Scanner myObj = new Scanner(System.in);
        int process = 0;
        double user_input = 0;
        DecimalFormat degreesFormat = new DecimalFormat("##0.00"); //formats the returned Celsius conversion

        //MAIN PROGRAM
        while (process == 0) { //loops until input is received in Fahrenheit
            double Celsius = 0;
            System.out.println("Enter a numeric double value for Celsius in the range of -135.0 to 135.0 to convert to Fahrenheit");
            try { //try catch statement to only obtain numeric float input
                Fahrenheit = Double.parseDouble(myObj.next()); // obtains input from scanner
                if (Fahrenheit >= -135.0F && Fahrenheit <= 135.0F) { //check afterward that the input is withing the range of 0 to 100.
                    Celsius = TempConversion(Fahrenheit); //store each value in the array during each loop
                    process = 1;
                }
                else { //if the input is a numeric float, but does not meet the range specified in the if statement
                    System.out.println("Error! Input is larger than 135.0F and less than -135.0F"); // print and Error message saying input is not in range
                }
            } catch (Exception e) { //catch exception for errors
                System.out.println("Error! Input is not a numeric Integer."); // prints error message that input is not a numeric integer
                Fahrenheit = 0.00;
                continue;
            }
            System.out.println(Fahrenheit + "°F  Fahrenheit is equal to " + degreesFormat.format(Celsius)+ "°C when converted to Celsius.");
            //System.out.println(Celsius);
        }
    }

    //Method that obtains verified input and passes it through function that converts the Celsius input and
    // converts it into Fahrenheit
    public static double TempConversion(double num) {//creates method for calculating conversion, only accepts float
        // Code to be executed
        double Celsius; //initializes  variable
        //initializes constant double of the "ratio of change" between Fahrenheit and Celsius, needed in conversion formula
        final double RATIOOFCHANGE = (float) 5 / 9;
        //initializes constant the for Fahrenheit's freeing point, need for formula
        final int FAHRENHEITFREEZINGPOINT = 32;

        //Fahrenheit to Celsius Calculation
        Celsius = RATIOOFCHANGE * (num - FAHRENHEITFREEZINGPOINT);
        //Displays output of conversion of Celsius and initial user input for Fahrenheit
        return Celsius;
    }

}

