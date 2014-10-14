/**
 * 
 */

/**
 * @author Yuteng Mei



 *
 */
// import File object.
import java.util.*;

import java.io.*;

public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Declare three variables to store the value of each balance.
		double checkingBalance = 0.0;
		double savingBalance = 0.0;
		double creditBalance = 0.0;
		// Declare scanner object to import file.
		Scanner input = new Scanner(new File("src/input.txt"));

		// Use while loop to check the each input of the file
		while (input.hasNext()) {
			// Skip the date.
			input.next();
			// Store next string to the variable called one.
			String one = input.next();
			// Check what account type it is, and then add the deposit or
			// withdrawal amount to the balances
			if (one.equals("Checking")) {
				checkingBalance += checkingAmount(input);
			} else if (one.equals("Savings")) {
				savingBalance += savingAmount(input);
			} else {
				// Skip string card
				input.next();
				creditBalance += creditAmount(input);

			}

		}
		// output the balances after the transaction to the file call output.txt
		PrintStream output = new PrintStream(new File("src/output.txt"));
		output.println("Total Checking Balance: " + checkingBalance);
		output.println("Total Savings Balance: " + savingBalance);
		output.println("Total Credit Card Balance: " + creditBalance);

	}

	// Calculate the checking balance after the transaction, then return the
	// amount
	public static double checkingAmount(Scanner input) {
		// Store the next string to the variable called two.
		String two = input.next();
		// Declare a variable called amount to store return value.
		double amount = 0;
		// if next string is deposit, return positive amount. if it is
		// withdrawal, return negative amount.
		if (two.equals("Deposit")) {
			amount += input.nextDouble();
			return amount;
		}
		if (two.equals("Withdrawal")) {
			amount += input.nextDouble();
			return amount * -1;
		} else {
			// Skip string balance
			input.next();
			amount += input.nextDouble();
			return amount;
		}

	}

	// Calculate the savings balance after the transaction, then return the
	// amount
	public static double savingAmount(Scanner input) {
		// Store the next string to the variable called two.
		String two = input.next();
		// Declare a variable called amount to store return value.
		double amount = 0;
		// if next string is deposit, return positive amount. if it is
		// withdrawal, return negative amount.
		if (two.equals("Deposit")) {
			amount += input.nextDouble();
			return amount;
		}
		if (two.equals("Withdrawal")) {
			amount += input.nextDouble();
			return amount * -1;

		} else {
			// skip string balance
			input.next();
			amount += input.nextDouble();
			return amount;
		}

	}

	// Calculate the credit balance after the transaction, then return the
	// amount
	public static double creditAmount(Scanner input) {
		// Store the next string to the variable called two.
		String two = input.next();
		// Declare a variable called amount to store return value.
		double amount = 0;
		// if next string is deposit, return positive amount. if it is
		// withdrawal, return negative amount.
		if (two.equals("Deposit")) {

			amount += input.nextDouble();
			return amount;
		}
		if (two.equals("Withdrawal")) {

			amount += input.nextDouble();
			return amount * -1;

		} else {
			// skip string balance
			input.next();
			amount += input.nextDouble();
			return amount;
		}

	}
}
