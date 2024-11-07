/*
 Author: Christian Powlette
 Due  Date: February 02,
 Professor: Yuvaraj Sambandan
 Course: COSC-1200-06 Object Oriented Programming
*/
class Assignment1 {
    public static void main(String[] args) {
        /* declare and initialize variables and a constant
        PART B. Add code to VariableDemo.java that declares and initialize, with appropriate
        names and values, primitive variables of type short, long, byte, and float.
        Remember to qualify your right-hand operand with the appropriate suffix where
        appropriate. */
        byte byteNumber = 127; //data type: byte variable
        short shortNumber = 32767 ; //data type: short variable
        int intFive = 2147483647; //data type: integer variable
        long longNumber = 989947299; //data type: long variable
        float floatPI = 3.1415927F; //data type: float variable
        double doubleNumber = 4.8; //data type: double variable
        final double INTEREST_RATE = 2.5; // data type: double constant
        boolean trueFalse = true; //data type: boolean variable
        char charD = 'D'; //data type: character variable
        String helloSpring = "Hello Spring 2023!";

        /*PART C. Add code to display all of the newly declared variables. Note: Each variable must
        have an appropriate label to explain what it is.
        display variable contents */
        System.out.println("byteNumber = " + byteNumber); // displays byte
        System.out.println("shortNumber = " + shortNumber); //displays short
        System.out.println("intFive = " + intFive); //displays integer
        System.out.println("longNumber = " + longNumber); //displays long
        System.out.println("floatPI = " + floatPI); //displays float
        System.out.println("doubleNumber = " + doubleNumber); //displays double
        System.out.println("INTEREST_RATE = " + INTEREST_RATE); //displays constant double
        System.out.println("trueFalse = " + trueFalse); //displays boolean
        System.out.println("charD = " + charD); //displays char
        System.out.println("helloSpring = " + helloSpring); //displays string

        /* PART D. Finally, add code that places the contents of your float into your variable type
        long. Note: This will require that you cast the variable
         ADD ADDITIONAL FUNCTIONALITY HERE: */
        long newlong; //declares new long variable
        newlong = (long) floatPI; //cast long variable to float
        System.out.println("casted long = " + newlong); //displays casted float to a long

        //BEGINNING OF  loopDemo.java Import
        // while loop
        int i = 1; // declare & initialize loop counter variable
        while (i <= 3) // loop while i is < = 3
        {
            System.out.println("while loop: i = " + i);
            i = i + 1; // increment loop counter
        }

        // do loop
        int j = 1;
        do {
            System.out.println("do loop: j = " + j);
            j++;                // use the increment operator
        } while (j <= 3);


        // pre-test & post-test compared
        j = 1;
        while (j > 3) // expression is initially false
        {
            System.out.println("while loop executed");
        }

        do {
            System.out.println("do loop executed");
        } while (j > 3); // expression is initially false


        // for loop
        for (int k = 1; k <= 3; k++) {
            System.out.println("for loop: k = " + k);
        }

        // ADD ADDITIONAL FUNCTIONALITY HERE:
        /*PART A. Create two nested for loops, the outer loop should start at 1 and should stop
        executing when its counter gets to 3. The inner loop should start at 0, and stop
        executing when the counter is greater than 2. The inner loop should display both
        the outer and inner counters. */
        for (int x = 1; x <= 3; i++) { //Outer for loop begins at 1 and increments by 1 until a value of 3
            for (int y = 0; y <= 2; y++) { //Inner for loop begins at 0 and increments by 1 until a value of 2
                System.out.println("Outer counter: " + x + ", Inner counter: " + y);
                x = x + 1;
            }
        }
        // PART B. Create a do…while loop that starts at 0 and counts up to 10 by 2s. The loop
        //should display the counter each time through.
        int a = 0; //declares variable a and stores 0 value
        do { //do loop, loops while a not equivalent or greater than 10
            System.out.println(a); //displays current stored value
            a += 2; //increments a variable by a value of 2
        }
        while (a <= 10);
        /*PART C.  Create a while loop that starts at 9 and counts down by 3s, and stops executing
        when the counter is less than or equal to zero. The counter should be displayed
        each time. */
        int b = 9; //declares and stores 9 in integer variable b
        while (b >= 0) { //while loop, loops while b variable is not less than or equivalent to 0
            System.out.println(b); //displays current stores value during each loop
            b -= 3; //de-increments stored b value by 3, each loop
        }
    }
}



