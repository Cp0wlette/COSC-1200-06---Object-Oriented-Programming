import java.text.DecimalFormat;
/*
 Author: Christian Powlette
 Due  Date: March 04, 2024
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object-Oriented Programming
 Description of class: This class is used created objects of the
 Credit Card's properties assigned to a card
 */

/*Creates the class "CreditCard" used to create objects
used to assign properties to the Credit Card */
public class CreditCard {
    private final long accountNumber; // declares a variable with default value for "long"
    private final int month; // declares a variable with default value for "integer"
    private final int year; // declares a variable with default value for
    // "integer"
    private final String holder; // declares a variable with default value for "String"

    // declares a Constant with a String value for default name
    private static final String DEFAULT_NAME = "Bob Loblaws";
    // declares a Constant with a Long value for account number
    private static final long DEFAULT_ACCOUNT_NUMBER = 1234567890123456L;
    // declares a Constant with a Integer value for default month
    private static final int DEFAULT_MONTH = 1;
    // declares a Constant with a Integer value for default year
    private static final int DEFAULT_YEAR = 99;
    // declares a Constant with a Integer value for the maximum length for account
    // numbers
    public static final long ACCOUNT_NUMBER_LENGTH = 16;
    DecimalFormat monthYearFormat = new DecimalFormat("00");

    /* A constructor that accepts four arguments of the properties of a Credit
    Card, that places each argument parameter into it’s appropriate property */
    public CreditCard(long accountNumber, int month, int year, String holder) {
        this.accountNumber = accountNumber; // passes argument into account number property
        this.month = month; // passes argument into month property
        this.year = year; // passes argument into year property
        this.holder = holder; // passes argument into holder property
    }

    /* A default constructor that does not take any arguments, but set's
    the attributes to the private class values listed underneath. */
    public CreditCard() {
        // sets the Constant "DEFAULT_NAME" as the default name property assigned to
        // the card
        this.holder = DEFAULT_NAME;
        // sets the Constant "DEFAULT_ACCOUNT_NUMBER" as the default account number
        // property assigned to the card
        this.accountNumber = DEFAULT_ACCOUNT_NUMBER;
        // sets the Constant "DEFAULT_MONTH" as the default month property assigned
        // to the card
        this.month = DEFAULT_MONTH;
        // sets the Constant "DEFAULT_YEAR" as the default year property assigned to
        // the card
        this.year = DEFAULT_YEAR;
    }
    /* A instance method that  displays credit card information */
    public void displayCardInfo() {
        System.out.println("Card Holder Name: " + holder); // Displays the Card Holder Name
        System.out.println("Account Number: " + accountNumber); // Displays Account Number
        System.out.printf("Month/Year: " + monthYearFormat.format(month) + "/" + monthYearFormat.format(year)); // Displays Month/Year using decimal format
        System.out.printf("%n");
    }
    /* A method named that returns a boolean and checks,
    using the Constant, "ACCOUNT_NUMBER_LENGTH",
    whether the number in an objects account number attribute is valid */
    public boolean verifyAccountNumber() {
        // Wrapper Class that converts the long to a String
        String accountNumberWrapper = Long.toString(accountNumber);
    /*returns True or False depending on whether the stored accountNumber
    length is equivalent to that of the length of the Constant length for
    accounts */
        return accountNumberWrapper.length() == ACCOUNT_NUMBER_LENGTH;
    }
}

