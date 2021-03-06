import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author yuten_000
 *
 */

// A class that analyze the input file
public class Calculate {

	// Declare the public variable named allDegree and store 0.0 value.
	public double allDegree = 0.0;
	// Declare the public variable named maxValue and store 0.0 value.
	public double maxValue = 0.0;
	// Declare the public variable named minValue and store 1000.0 value.
	public double minValue = 1000.0;

	// Create a Data array object named data.
	Data[] data;
	// Create a Scanner object called input.
	Scanner input;

	/**
	 * Create a constructor to read the input file.
	 * 
	 * @throws FileNotFoundException
	 */
	public Calculate() throws FileNotFoundException {

		this.input = new Scanner(new File("src/input.txt"));
		// Create a Store object named x
		Store x = new Store();
		// Call a getData method in the Store object and set it to the Data
		// array object called data.
		this.data = x.getData();
	}

	/**
	 * A method that calculate the average degree of the input file
	 * 
	 * @return The average degree
	 * @throws FileNotFoundException
	 */
	public double getAverage() throws FileNotFoundException {
		for (Data d : this.data) {
			this.allDegree += d.getDegree();
		}
		return this.allDegree / this.data.length;
	}

	/**
	 * A method that calculate the maximum degree of the input file
	 * 
	 * @return Maximum degree
	 * @throws FileNotFoundException
	 */

	public double getMax() throws FileNotFoundException {

		for (Data d : this.data) {
			if (d.degree > maxValue) {
				maxValue = d.degree;
			}
		}
		return maxValue;
	}

	/**
	 * A method that calculate the minimum degree of the input file
	 * 
	 * @return Minimum degree
	 * @throws FileNotFoundException
	 */
	public double getMin() throws FileNotFoundException {

		for (Data d : this.data) {
			if (d.degree < minValue) {
				minValue = d.degree;
			}

		}
		return minValue;

	}

}
