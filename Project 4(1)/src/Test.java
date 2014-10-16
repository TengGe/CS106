/**
 * 
 */

/**
 * @author ymei
 *
 */
import java.util.*;
import java.io.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("src/input.txt"));
		int size = 0;
		while (input.hasNextLine()) {
			String one = input.nextLine();
			size++;
		}
		input.close();
		String[] dates = new String[size];
		String[] accounts = new String[size];
		String[] transactions = new String[size];
		double[] amounts = new double[size];
		int x = 0;
		input = new Scanner(new File("src/input.txt"));
		while (input.hasNext()) {
			dates[x] = input.next();
			accounts[x] = input.next();
			if (accounts[x].equals("Credit")) {
				accounts[x] = accounts[x] + " " + input.next();
			}
			transactions[x] = input.next();
			if (transactions[x].equals("Opening")) {
				transactions[x] = transactions[x] + " " + input.next();

			}
			amounts[x] = input.nextDouble();

			x++;
		}
    input.close();
		double checkingBalance = 0.0;
		double savingBalance = 0.0;
		double creditBalance = 0.0;
		for (x = 0; x < dates.length; x++) {
			if (accounts[x].equals("Checking")) {
				if (transactions[x].equals("Withdrawal")) {
					checkingBalance -= amounts[x];
				} else {
					checkingBalance += amounts[x];
				}
			}

			if (accounts[x].equals("Savings")) {
				if (transactions[x].equals("Withdrawal	")) {
					savingBalance -= amounts[x];
				} else {
					savingBalance += amounts[x];
				}
			}
				
				else{
					if (transactions[x].equals("Withdrawal")) {
						creditBalance -= amounts[x];
					} else {
						creditBalance += amounts[x];
					}
				}

			
		

	}
		System.out.println(checkingBalance);
        System.out.println(savingBalance);
        System.out.println(creditBalance );
}
}
