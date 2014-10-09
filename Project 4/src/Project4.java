/**
 * 
 */

/**
 * @author Yuteng Mei

 *
 */
import java.util.*;
import java.io.*;

public class Project4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("src/input.txt"));

		while (input.hasNext()) {
			input.next();
			String one=input.next();
			if (one.equals("Checking")) {
				checkingAmount(input);
			} else if (one.equals("Saving")) {
				savingAmount(input);
			} else {
				input.next();
				creditAmount(input);

			}
		}

	}

	public static void checkingAmount(Scanner input) {
		String two = input.next();
		double checkingBalance = 0.0;
		if (two.equals("Deposit")) {
			checkingBalance += input.nextDouble();
		} else if (two.equals("Withdrawal")) {
			checkingBalance -= input.nextDouble();

		} else {
            input.next();
			checkingBalance += input.nextDouble();
		}
		System.out.println(checkingBalance);
	}

	public static void savingAmount(Scanner input) {
		String two = input.next();
		double savingBalance = 0.0;
		if (two.equals("Deposit")) {
			savingBalance += input.nextDouble();
		} else if (two.equals("Withdrawal")) {
			savingBalance -= input.nextDouble();

		} else {
            input.next();
			savingBalance += input.nextDouble();
		}
		System.out.println(savingBalance);
	}

	public static void creditAmount(Scanner input) {
		String two = input.next();
		double creditBalance = 0.0;
		if (two.equals("Deposit")) {
			
			creditBalance += input.nextDouble();
		} else if (two.equals("Withdrawal")) {
			
			creditBalance -= input.nextDouble();

		} else {
          
            input.next();
			creditBalance += input.nextDouble();
		}
		System.out.println(creditBalance);
	}
}
