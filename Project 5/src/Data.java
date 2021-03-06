import java.io.File;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author yuten_000
 *
 */

// Create a class the store the data of the input file as array.
public class Data {

	// Declare the variables name date, day of week, and degree
	String date;
	String dayOfWeek;
	double degree;

	/**
	 * Create a constructor that initial the variables.
	 * 
	 * @param intidate
	 *            Initial the default value of date.
	 * @param initdayOfWeek
	 *            Initial the default value of day of week.
	 * @param intidegree
	 *            Initial the default value of degree.
	 */
	public Data(String intidate, String initdayOfWeek, double intidegree) {
		this.date = intidate;
		this.dayOfWeek = initdayOfWeek;
		this.degree = intidegree;

	}

	/**
	 * A method that return the degrees of the input file
	 * 
	 * @return return the degrees of the input file
	 */
	public double getDegree() {
		return this.degree;
	}

}
