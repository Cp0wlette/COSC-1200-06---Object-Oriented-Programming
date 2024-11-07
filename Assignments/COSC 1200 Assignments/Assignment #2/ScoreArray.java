/*
 Author: Christian Powlette
 Due  Date: February 16, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: Program that calculated the highest, lowest, and average of user input
*/

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {

        // DECLARATIONS
        int[] scores = new int[8]; // Declare and initialize an array of 8 integers
        Scanner myObj = new Scanner(System.in); // Create a Scanner object for user input
        double averageScore = 0; // Initialize double averageScore to calculate average later on
        int highestScore = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int lowestScore = Integer.MAX_VALUE; // Initialize with the largest possible value
        int scoresInput; // Initialize the variable for input

        // MAIN PROGRAM
        for (int i = 0; i < scores.length; i++) {

            // Loop until valid input is received

            System.out.print("Enter numeric integer score " + (i + 1) + ": ");
            try {scoresInput = Integer.parseInt(myObj.next()); // Check that input received is a numeric integer
                if (scoresInput >= 0 && scoresInput <= 100) {
                    scores[i] = scoresInput; // Store each value in the array during each loop
                    averageScore += scores[i]; // Update the averageScore
                    highestScore = Math.max(highestScore, scores[i]); // Update the highestScore
                    lowestScore = Math.min(lowestScore, scores[i]); // Update the lowestScore
                    break; // Exit the loop if valid input
                } else {
                    System.out.println("Please enter a numeric integer between 0 and 100.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric integer.");
            }
        }


        // Calculate the average
        averageScore /= scores.length;

        // Display results
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Average score: " + averageScore);
    }
}