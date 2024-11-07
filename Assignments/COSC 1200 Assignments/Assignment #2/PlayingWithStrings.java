/*
 Author: Christian Powlette
 Due  Date: February 16, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: A program Displays a multitude of String Methods
*/
public class PlayingWithStrings {
    public static void main(String[] args) {

        //DECLARATIONS
        String lastname = "Powlette";
        int thirdLastLetter = lastname.length() - 3;

        //MAIN PROGRAM
        System.out.println("My lastname '" + lastname + "' is " + lastname.length() + " characters long.");
        System.out.println("The third-to-last character of my last name is '" + lastname.charAt(thirdLastLetter) + "'.");
        System.out.println("My last name in upper-case is '" + lastname.toUpperCase() + "'.");
        System.out.println("My last name in lower-case is '" + lastname.toLowerCase() + "'.");
        if (lastname == "Short") {
            System.out.println("I have the same last name as Professor Short.");
        }else if (lastname != "Short") {
            System.out.println("My lastname is not the same as Professor Short");
        }if (lastname == "Patel") {
            System.out.println("My last name is the same as 'Patel'");
        } else if (lastname != "Patel") {
            System.out.println("MY last name is not the same as 'Patel'");
        }if (lastname.contains("ne")) {
            System.out.println("My lastname, " + lastname + " contains the character sequence 'ne'");
        }else if (!lastname.contains("ne")) {
            System.out.println("My lastname, " + lastname + " does not contain the character sequence 'ne'");
        }

        }
}