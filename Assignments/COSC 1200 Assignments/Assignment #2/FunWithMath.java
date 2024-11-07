/*
 Author: Christian Powlette
 Due  Date: February 16, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: A program that accepts calculates various interest values
*/
import java.text.DecimalFormat;

public class FunWithMath {
    public static void main(String[] args) {

        //DECLARATIONS
        int currentValue = 0;
        double futureValue = 1000000;
        double annualInterestRate = Math.random(); // Random interest rate between 0% and 10%
        int yearsInTheFuture = 20;

        //MAIN PROGRAM

        // Calculate present value using compound interest formula of a future amount PV = FV / (1 + r)^t
        double presentValue = futureValue /Math.pow((1 + annualInterestRate),yearsInTheFuture); // PV= 1000000 / (1 + interest) ^ 20

        // Initiate  DecimalFormat objects
        DecimalFormat dollarFormat = new DecimalFormat("$0,000.00"); //formats the Future Value
        DecimalFormat interestRateFormat = new DecimalFormat("0.000%"); //formats the annual interest rate

        // Display results
        System.out.println("The Future Value is: " + dollarFormat.format(futureValue)); //displays a concatenated future value message
        System.out.println("The Annual Interest Rate is: " + interestRateFormat.format(annualInterestRate)); //displays a concatenated Annual Interest message
        System.out.println("The Years in the Future are: " + yearsInTheFuture); //displays the concatenated time years variable message
        System.out.println("The Present Value is: " + dollarFormat.format(presentValue)); //displays a concatenated present value message
    }
}
