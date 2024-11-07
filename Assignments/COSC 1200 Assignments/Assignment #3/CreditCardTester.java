/*
 Author: Christian Powlette
 Due  Date: March 04, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: This class is used test the Credit Card Class
 by inserting data into the parameters of the Credit Card method and displaying
 the data by utilizing a method and a method from the CreditCard class
 */

/*
 Creates the Java class that instantiates three of objects that are passed
 arguments
 */
public class CreditCardTester {
    public static void main(String[] args) {
        // The first object is not passed arguments, therefore it uses the default
        // values
        CreditCard card1 = new CreditCard();
        // The second object is passed arguments such as account number, month,
        // year, and holder
        CreditCard card2 = new CreditCard(5312264554231345L, 1, 10, "Jane Smith");
        // The second third is passed arguments such as account number, month, year,
        // and holder
        CreditCard card3 = new CreditCard(10234, 5, 8, "Neva Read");

        // A System.out.println message that displays which card information that is
        // shown
        System.out.println("Displaying data for card 1:");
        // calls the displayCardInfo method in Credit Card and displays the first
        // card information
        card1.displayCardInfo();

        // A System.out.println message that displays which card information that is
        // shown
        System.out.println("Displaying data for card 2:");
        // calls the displayCardInfo method in Credit Card and displays the second
        // card information
        card2.displayCardInfo();

        // A System.out.println message that displays which card information that is
        // shown
        System.out.println("Displaying data for card 3:");
        // calls the displayCardInfo method in Credit Card and displays the third
        // card information
        card3.displayCardInfo();

        // Three System.out.println() messages that indicate whether each of the
        // account numbers is valid (True) or invalid (False). The only one will be
        // invalid (False) is Neva Read’s (Card 2)
        System.out.println("Verification Status of account number for card 1: " + card1.verifyAccountNumber());
        System.out.println("Verification Status of account number for card 2: " + card2.verifyAccountNumber());
        System.out.println("Verification Status of account number for card 3: " + card3.verifyAccountNumber());
    }
}