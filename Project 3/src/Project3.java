/**
 * 
 */

/**
 * @author Yuteng Mei

 */

// Declare a import java package 
import java.util.*;

public class Project3 {

	/**
	 * @param args
	 *            Main method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare two variables to store values.
		int typeOne = 0;
		int typeTwo = 0;

		// scanner gets its input from the console
		Scanner console = new Scanner(System.in);

		/**
		 * Call a method named questionOne
		 */
		questionOne(console, typeOne, typeTwo);
	}

	/**
	 * This method ask a question and prompt user for answer.
	 * 
	 * @param console
	 *            sent Scanner object to the method and enable user to send
	 *            input.
	 * @param typeOne
	 *            sent the value of typeOne to the method as parameter.
	 * @param typeTwo
	 *            sent the value of typeTwo to the method as parameter.
	 */
	public static void questionOne(Scanner console, int typeOne, int typeTwo) {
		// Ask user a question.
		System.out.println("Do You like to play games? Yes or No");
		// Declare a string variable named one that store user's input
		String one = console.nextLine();

		while (!(one.equalsIgnoreCase("Yes") || one.equalsIgnoreCase("No"))) {
			System.out.println("Not the answer i want");
			System.out.print("Try again:");
			one = console.nextLine();
		}

		// use if statement and cumulative algorithm to score responses.
		if (one.equalsIgnoreCase("Yes")) {
			typeOne += 2;
		} else {
			typeOne--;
			typeTwo += 4;
		}
		// Call a method named questionTwo
		// Pass the values that got from questionOne method and send it to the
		// next method
		questionTwo(console, typeOne, typeTwo);
	}

	/**
	 * This method ask second question and prompt user for answer.
	 * 
	 * @param console
	 *            sent Scanner object to the method and enable user to send
	 *            input.
	 * @param typeOne
	 *            sent the value of typeOne to the method as parameter.
	 * @param typeTwo
	 *            sent the value of typeTwo to the method as parameter.
	 */
	public static void questionTwo(Scanner console, int typeOne, int typeTwo) {
		System.out.println("Which sport you like? ");
		System.out.println("A:Basketball");
		System.out.println("B:Football");
		System.out.println("C:Tennis");
		System.out.println("D.i dont like sport");
		// Declare a string variable named Two that store user's input
		String two = console.nextLine();
		while (!(two.equalsIgnoreCase("A") || two.equalsIgnoreCase("B")
				|| two.equalsIgnoreCase("C") || two.equalsIgnoreCase("D"))) {
			System.out.println("Please enter what i ask");
			System.out.print("Give me what i ask:");
			two = console.nextLine();
		}
		// use if statement and cumulative algorithm to score responses.
		if (two.equalsIgnoreCase("A")) {
			typeOne--;
			typeTwo += 2;
		} else if (two.equalsIgnoreCase("B")) {
			typeOne -= 2;
			typeTwo += 2;
		} else if (two.equalsIgnoreCase("C")) {
			typeOne--;
		} else {
			typeOne++;
		}
		// Call a method named questionThree
		// Pass the values that got from questionTwo method and send it to the
		// next method
		questionThree(console, typeOne, typeTwo);

	}

	/**
	 * This method ask third question and prompt user for answer.
	 * 
	 * @param console
	 *            sent Scanner object to the method and enable user to send
	 *            input.
	 * @param typeOne
	 *            sent the value of typeOne to the method as parameter.
	 * @param typeTwo
	 *            sent the value of typeTwo to the method as parameter.
	 */
	public static void questionThree(Scanner console, int typeOne, int typeTwo) {
		System.out.println("Which movies you like?");
		System.out.println("A: Star Trek");
		System.out.println("B: Beneath The Planet of The Apes");
		System.out.println("c: Groundhog Day");
		System.out.println("D: I dont know any of this movies");
		// Declare a string variable named three that store user's input
		String three = console.nextLine();
		while (!(three.equalsIgnoreCase("A") || three.equalsIgnoreCase("B")
				|| three.equalsIgnoreCase("C") || three.equalsIgnoreCase("D"))) {
			System.out.println("Please enter what i ask");
			System.out.print("Give me what i ask:");
			three = console.nextLine();
		}
		// use if statement and cumulative algorithm to score responses.
		if (three.equalsIgnoreCase("A")) {
			typeOne += 3;
		} else if (three.equalsIgnoreCase("B")) {
			typeOne++;
		} else if (three.equalsIgnoreCase("C")) {
			typeTwo += 3;
			typeOne -= 4;
		} else {
			typeOne -= 4;
			typeTwo--;
		}
		// Call a method named questionFour
		// Pass the values that got from questionThree method and send it to the
		// next method
		questionFour(console, typeOne, typeTwo);
	}

	/**
	 * This method ask four question and prompt user for answer.
	 * 
	 * @param console
	 *            sent Scanner object to the method and enable user to send
	 *            input.
	 * @param typeOne
	 *            sent the value of typeOne to the method as parameter.
	 * @param typeTwo
	 *            sent the value of typeTwo to the method as parameter.
	 */
	public static void questionFour(Scanner console, int typeOne, int typeTwo) {
		System.out
				.println("If you have one million dollar, what are you to do?");
		System.out.println("A:I going to buy a big mansion");
		System.out.println("B: I going to buy a nice car");
		System.out.println("c: I going to buy a island");
		System.out.println("D: I going to save it");
		// Declare a string variable named four that store user's input.
		String four = console.nextLine();
		while (!(four.equalsIgnoreCase("A") || four.equalsIgnoreCase("B")
				|| four.equalsIgnoreCase("C") || four.equalsIgnoreCase("D"))) {
			System.out.println("Please enter what i ask");
			System.out.print("Give me what i ask:");
			four = console.nextLine();
		}
		// use if statement and cumulative algorithm to score responses.
		if (four.equalsIgnoreCase("A")) {
			typeOne++;
			typeTwo++;
		} else if (four.equalsIgnoreCase("B")) {
			typeOne++;
			typeTwo += 2;
		} else if (four.equalsIgnoreCase("C")) {
			typeTwo += 3;
			typeOne += 2;
		} else {
			typeOne += 3;
			typeTwo--;
		}
		// Call a method named comparison.
		// Pass the values that got from questionFour method and pass it to the
		// next method.
		comparison(typeOne, typeTwo);
	}

	/**
	 * Declare a method named comparison.
	 * 
	 * @param typeOne
	 *            sent the value of typeOne to the method as parameter.
	 * @param typeTwo
	 *            sent the value of typeTwo to the method as parameter.
	 */
	public static void comparison(int typeOne, int typeTwo) {
		// Use if statement to determines which type has bigger values.
		// Print out the which type of person you are.
		if (typeOne > typeTwo) {
			System.out.println("You are a nerd;but nerds are cool now");
		} else {
			System.out.println("Ok, you are normal people");
		}
	}
}