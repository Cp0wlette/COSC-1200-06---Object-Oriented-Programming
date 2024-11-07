// Don't forget a header comment block
public class LoopDemo {
	public static void main(String[] args) {

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
		//PART A. Create two nested for loops, the outer loop should start at 1 and should stop
		//executing when its counter gets to 3. The inner loop should start at 0, and stop
		//executing when the counter is greater than 2. The inner loop should display both
		//the outer and inner counters.
		for (int x = 1; x <= 3; i++) {
			for (int y = 0; y <= 2; y++) {
				System.out.println("Outer counter: " + x + ", Inner counter: " + y);
				x = x + 1;
			}
		}
		// PART B. Create a do…while loop that starts at 0 and counts up to 10 by 2s. The loop
		//should display the counter each time through.
		int a = 0;
		do {
			System.out.println(a);
			a += 2;
		}
		while (a <= 10);
		//PART C.  Create a while loop that starts at 9 and counts down by 3s, and stops executing
		//when the counter is less than or equal to zero. The counter should be displayed
		//each time.
		int b = 9;
		while (b >= 0) {
			System.out.println(b);
			b -= 3;
		}
	}
}











