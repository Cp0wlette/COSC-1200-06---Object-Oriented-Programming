/*
 Author: Christian Powlette
 Due  Date: February 02,
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object Oriented Programming
*/
import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
        char letterGrade; //declares character variable letterGrade
        int  finalGrade; //declares integer variable finalGrade
        String Status; //declares String variable Status
        //Int Declarations
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your final grade score, to be assigned a letter accordingly.");
        finalGrade = myObj.nextInt();
        //if statement checks if finalGrade input is greater than or equivalent to 90 or less than or equivalent to 100
        if (finalGrade >= 90 && finalGrade <= 100)
        {
            letterGrade = 'A'; //sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        //else if statement  checks if finalGrade input is greater than or equivalent to 80 or less than or equivalent to 89
        else if (finalGrade >= 80 && finalGrade <= 89)
        {
            letterGrade = 'B';//sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        //else if statement  checks if finalGrade input is greater than or equivalent to 70 or less than or equivalent to 79
        else if (finalGrade >= 70 && finalGrade <= 79)
        {
            letterGrade = 'C';//sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        //else if statement  checks if finalGrade input is greater than or equivalent to 60 or less than or equivalent to 69
        else if (finalGrade >= 60 && finalGrade <= 69)
        {
            letterGrade = 'D';//sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        //else if statement checks if finalGrade input is greater than or equivalent to 50 or less than or equivalent to 59
        else if (finalGrade >= 50 && finalGrade <= 59)
        {
            letterGrade = 'E';//sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        else //program asses else statement if input is less than 50
        {
            letterGrade = 'F';//sets variable "letterGrade" to grade letter accordingly to checked integer finalGrade
            //displays message showing final Grade input and processed letter Grade accordingly
            System.out.println("your final Grade of " + finalGrade + " is equivalent to a letter grade of " + letterGrade);
        }
        if (letterGrade == 'F') { //Checks if letterGrade is equal to letter grade
            Status = "failed"; //sets String "Status" to accordingly
            System.out.println(finalGrade + " = " + letterGrade + " you have " + Status); //displays status "failed" and letter Grade
        }
        else { //asses else if not equal to above if statement
            Status = "passed";//sets String "Status" to accordingly
            System.out.println(finalGrade + " = " + letterGrade + " you have " + Status); //displays status "passed" and letter Grade
        }
    }
}
