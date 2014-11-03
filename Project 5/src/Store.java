import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// A class that populate the array from the file.
public class Store {
	// Declare a public variable i that contains the value of 0.
	public int i = 0;

	Scanner input;

	public Store() throws FileNotFoundException {

		this.input = new Scanner(new File("src/input.txt"));
	}

	// Create a Lines object.
	Lines x = new Lines();
	/**
	 * Create a Data array object named degrees. Set the size equal number of
	 * lines of the input file.
	 */
	public Data[] degrees = new Data[x.getLines()];

	/**
	 * A method that populate the array from the file.
	 * 
	 * @return the arrays of the input file.
	 * @throws FileNotFoundException
	 */
	public Data[] getData() throws FileNotFoundException {

		while (input.hasNext()) {
			// Get the date of the input file.
			String date = input.next();
			// Get the day of week of the input file.
			String dayOfWeek = input.next();
			// Get the degree of the input file.
			double degree = input.nextDouble();

			// Add a Data object to the array with the value.
			degrees[i] = new Data(date, dayOfWeek, degree);
			// Increment index.
			i++;
		}
		return degrees;

	}

}
