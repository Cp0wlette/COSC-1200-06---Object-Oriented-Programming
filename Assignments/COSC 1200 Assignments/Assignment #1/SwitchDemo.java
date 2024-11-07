/*
 Author: Christian Powlette
 Due  Date: February 02,
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object Oriented Programming
*/
import java.util.Scanner; //imports scanner util

public class SwitchDemo {
    public static void main(String[] args) {
        char letterGrade;
        //Beginning  of Nested if...else statement program
        Scanner myObj = new Scanner(System.in); //creates scanner variable
        System.out.println("Enter your letter grade."); //displays message for input prompt to user
        letterGrade = myObj.next().charAt(0); //assesses next character input
        if (letterGrade < 'A' || letterGrade > 'z') { //if statement checks if input is NOT within the scope of alphabet (A-Z)
            System.out.println("ERROR!. Please enter a  character only.");
        } else { //if input is within the scope of the alphabet the following is assessed
            if (letterGrade == 'A') { //if the character input is equal to letter the following message is displayed
                System.out.println("Great work!"); //displays message accordingly to checked letter
            } else if (letterGrade == 'B') { //if the character input is equal to letter the following message is displayed
                System.out.println("Good work!"); //displays message accordingly to checked letter
            } else if (letterGrade == 'C') { //if the character input is equal to letter the following message is displayed
                System.out.println("Average work."); //displays message accordingly to checked letter
            } else if (letterGrade == 'D') { //if the character input is equal to letter the following message is displayed
                System.out.println("Below average work."); //displays message accordingly to checked letter
            } else if (letterGrade == 'F') { //if the character input is equal to letter the following message is displayed
                System.out.println("Unsatisfactory work."); //displays message accordingly to checked letter
            } else { //if the input is within the scope of the alphabet, however is not a assessed grade, the following message is displayed
        System.out.println("ERROR! Please enter a letter grade of A, B, C, D, or F.");} //displays Error message

        // PART C. Once the nested if…else is completed, replicate the functionality using a switch statement instead
        //Beginning of Switch Version Program
        Scanner myObj2 = new Scanner(System.in); // creates new scanner variable
        System.out.println("Enter your letter grade."); //displays message for input prompt to user
        letterGrade = myObj2.next().charAt(0); //assesses next character input
        switch (letterGrade) { //creates switch assessment
            case 'A': //sets case to letter and if char input equivalent the below message is displayed
                System.out.println("Great work"); //displays message according to set case letter
                break; //breaks out of case check to assess next case letter
            case 'B': //sets case to letter and if char input equivalent the below message is displayed
                System.out.println("Good work"); //displays message according to set case letter
                break; //breaks out of case check to assess next case letter
            case 'C': //sets case to letter and if char input equivalent the below message is displayed
                System.out.println("Average work"); //displays message according to set case letter
                break; //breaks out of case check to assess next case letter
            case 'D': //sets case to letter and if char input equivalent the below message is displayed
                System.out.println("Below average work"); //displays message according to set case letter
                break; //breaks out of case check to assess next case letter
            case 'F': //sets case to letter and if char input equivalent the below message is displayed
                System.out.println("Unsatisfactory work"); //displays message according to set case letter
                break; //breaks out of case check to assess default (ELSE) - *another way i think of it*
            default: //sets the default (ELSE) - *another way i think of it*, to display below message
                System.out.println("ERROR! Please enter a letter grade of A, B, C, D, or F."); //displays message if input is not equivalent to above cases.
                break; //breaks out of default and ends program
            }
        }
    }
}
